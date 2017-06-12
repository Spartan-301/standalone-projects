import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private static ArrayList<Double> getVariable(){
        int arraySize;
        System.out.println("How many elements in the data set?");
        Scanner size = new Scanner(System.in);
        arraySize = size.nextInt();

        double[] array = new double[arraySize];

        System.out.println("input the numbers; line by line");
        for(int i=0;i<arraySize;i++) {
            Scanner elements = new Scanner(System.in);
            array[i] = elements.nextInt();
        }

        double mean = 0;
        for(int i=0;i<arraySize;i++){
            mean = mean + array[i];
        }
        mean = mean / arraySize;

        ArrayList<Double> variable = new ArrayList<Double>();

        for(int i=0;i<arraySize;i++){
            double k = array[i]-mean;
            variable.add(k);
        }
        //System.out.println(variable);

        return variable;
    }//variable function

    private static double process(ArrayList<Double> v1,ArrayList<Double> v2){

        double[] a = new double[v1.size()];
        double[] b = new double[v2.size()];
        double[] c = new double[v1.size()];
        double d = 0;
        double[] e = new double[v1.size()];
        double[] f = new double[v2.size()];
        double g = 0;
        double h = 0;
        double j;
        double k;
        double r;

        for(int i=0;i<v1.size();i++){
            a[i] = v1.get(i);
            b[i] = v2.get(i);
        }//turns lists into arrays

        for(int i=0;i<v1.size();i++) {
            c[i] = a[i] * b[i];
        }//multiplies arrays into another one

        for(int i=0;i<v1.size();i++) {
            d += c[i];
        }//adds all elements of the array together

        for(int i=0;i<v1.size();i++){
            e[i] = a[i]*a[i];
            f[i] = b[i]*b[i];
        }//squares elements of arrays into a new array

        for(int i=0;i<v1.size();i++){
            g += e[i];
            h += f[i];
        }//adds all of the squared values together

        j = g*h;
        k = Math.sqrt(j);
        r = d/k;

        return r;
    }//process function


    public static void main(String[] args) {
        Main a = new Main();
        ArrayList<Double> x  = a.getVariable();
        ArrayList<Double> y = a.getVariable();
        Main b = new Main();
        double r = b.process(x,y);
        System.out.println(r);
        
    }//main
}//class
