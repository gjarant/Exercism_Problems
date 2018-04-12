import java.util.*;


class SumOfMultiples {

    private int number;
    private int[] set;


    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {

        Set<Integer> multiplesToAdd = new TreeSet<>();

        for(int i = 0; i < this.set.length; i++){
            for(int j = 1; j < this.number; j++){
                if(j % this.set[i] == 0 ){
                    multiplesToAdd.add(j);
                }
            }
        }
        int result =0;
        Iterator<Integer> it = multiplesToAdd.iterator();
        while(it.hasNext()){
            result += it.next();
        }
        return result;
    }



}
