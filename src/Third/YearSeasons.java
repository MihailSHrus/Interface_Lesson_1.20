package Third;

public enum YearSeasons implements YearOperation {
    WINTER(-5.5),
    SPRING(6.6) {
        @Override
        public String getDescription() {
            return "Прохладное время года.";
        };
    },
    SUMMER(18.2) {
        @Override
        public String getDescription() {
            return "Тёплое время года.";
        };
    },
    AUTUMN(5.7) {
        @Override
        public String getDescription() {
            return "Прохладное время года.";
        };
    };
    private double temp;
    YearSeasons() {
    }
    YearSeasons(double temp) {
        this.temp = temp;
    }
    public double getTemp() {
        return temp;
    }
    public void printFav() {
        System.out.println("Любимое время года: Лето.");
        System.out.println("Лето - это 3 месяца: Июнь, Июль и Август.");
        System.out.println("Летом у меня День Рождения.");
        System.out.println("Летом очень жарко, поэтому можно спасаться поедеанием мороженного.");
    }
    public void seasonMatch(YearSeasons x) {
        switch (x) {
            case WINTER:
                System.out.println("Я люблю зиму.");
                break;
            case SPRING:
                System.out.println("Я люблю весну.");
                break;
            case SUMMER:
                System.out.println("Я люблю лето.");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень.");
                break;

        }
    }
    public String getDescription() {
        return "Холодное время года.";
    }
}