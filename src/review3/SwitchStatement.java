package review3;

public class SwitchStatement {
    public static void main(String[] args) {

        //switch statement of the World Cup and provide winners

        int worldCup=2022;
        switch (worldCup){
            case 2022:
                System.out.println("Winner is Argentina");
                break;
            case 2018:
                System.out.println("Winner is France");
                break;
            case 2014:
                System.out.println("Winner is Germany");
                break;
            case 2010:
                System.out.println("Winner is Spain");
                break;
            default:
                System.out.println("Winner is unknown");
        }
    }
}
