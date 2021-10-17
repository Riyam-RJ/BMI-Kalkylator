import java.util.Scanner;

public class BMIKalkylator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mata in din vikt i KG");
        double vikt = sc.nextDouble();
        System.out.println("Mata in din langd i M");
        double langd = sc.nextDouble();
        double BMI = (vikt / (langd * langd));

        System.out.println("Vikt         " + vikt);
        System.out.println("längd        " + langd);
        System.out.println("BMI          " + String.format("%.1f", BMI));
        System.out.println("Viktklass    " + getViktKlass(BMI));
    }
        public static String getViktKlass(double BMI){
            String resultat = "";

            if (BMI<18.5) resultat = "Undervikt";
            else if (BMI>18.5 && BMI<25) resultat = "Normalvikt";
            else if (BMI>25 && BMI<30) resultat = "Övervikt";
            else if (BMI>30 && BMI<35) resultat = "Fetma klass 1";
            else if (BMI>35 && BMI<40) resultat = "Fetma klass 2";
            else  resultat = "Fetma klass 3";

            return resultat;
        }
}
