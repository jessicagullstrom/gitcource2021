public class Main {

    public static void main(String[] args) {
        Day today = Day.THURSDAY;
        whatisTheSituation(today);
    }

    public static void whatisTheSituation(Day day) {

        switch (day) {

            case MONDAY:
                System.out.println("Ah finally Monday");
                break;
            case TUESDAY:
                System.out.println("Terrific Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("We love fika");
                break;
            case THURSDAY:
                System.out.println("Almost there");
                break;
            case FRIDAY:
                System.out.println("Whoop!");
                break;

        }
    }
}