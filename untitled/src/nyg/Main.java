package nyg;

public class Main {
    public static void main(String[] args){

        Sweet[] present = {new Ch("a", 1, 2),
                new Ch1("b", 3,5)};

        int ww = 0;
        for (int i = 0; i < present.length; i++ ){
            System.out.println(present[i].getW());
            ww = ww+present[i].getW();
        }
        System.out.println(ww);
    }
}
