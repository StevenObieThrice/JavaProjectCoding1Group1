public class JavaProjectCoding1Group1 {
    public static void main(String[] args) {

        int [] temps={72, 74, 70, 86, 90, 91, 78};
        int max=temps[0];
        int min=temps[0];

        for(int t:temps){
            if(t>max){
                max=t;
            }
            if(t<min){
                min=t;
            }
        }
        System.out.println("Maximum temp "+ max);
        System.out.println("Minimum temp "+ min);



    }
    }

