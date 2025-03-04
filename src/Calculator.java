

public class Calculator{

    private double tal1;
    private double tal2;
    private char tegn;

    public Calculator(double tal1, double tal2, char tegn){
        this.tal1 = tal1;
        this.tal2 = tal2;
        this.tegn = tegn;
    }

    public double calculator(){
        double result = 0;

        switch (tegn) {
            case '+':
                result = tal1 + tal2; // Addition
                break;
            case '-':
                result = tal1 - tal2; // Subtraktion
                break;
            case '*':
                result = tal1 * tal2; // Multiplikation
                break;
            case '/':
                if (tal2 != 0) {
                    result = tal1 / tal2; // Division
                } else {
                    System.out.println("Fejl: Division med nul er ikke tilladt.");
                }
                break;
            default:
                System.out.println("Fejl: Ugyldig operator.");
                break;
        }

        return result;
    }
    }

