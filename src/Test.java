public class Test {
    public static void main(String[] args) {
        int [] array = {1,45,32,32,65,2,34,12,22,32,34};
        int max = 0;
        int min = Integer.MAX_VALUE;
        int maxInd = 0;
        int minInd = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxInd = i;
            }
            if (array[i] < min) {
                min = array[i];
                minInd = i;
            }
        }
        System.out.println(maxInd +  " - max number index");
        System.out.println(minInd +  " - min number index");



    }
}
