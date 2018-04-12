class SpaceAge {

    Double seconds;
    Integer earthYearInSeconds = 31557600;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return this.seconds/earthYearInSeconds;
    }

    double onMercury() {
        return this.seconds/(0.2408467*earthYearInSeconds);
    }

    double onVenus() {
        return this.seconds/(0.61519726*earthYearInSeconds);
    }

    double onMars() {
        return this.seconds/(1.8808158*earthYearInSeconds);
    }

    double onJupiter() {
        return this.seconds/(11.862615*earthYearInSeconds);
    }

    double onSaturn() {
        return this.seconds/(29.447498*earthYearInSeconds);
    }

    double onUranus() {
        return this.seconds/(84.016846*earthYearInSeconds);
    }

    double onNeptune() {
        return this.seconds/(164.79132*earthYearInSeconds);
    }

}
