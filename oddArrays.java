
public class oddArrays {

    public static void main(String[] args) {
        int[] oddnumbers = new int[10];
        int index = 0;
        for (int i = 0; i <= 20; i++) {
            if (i == 0) {
                continue;
            }
            if (i % 2 != 0) {
                oddnumbers[index] = i;
                index++;
            }
        }
        int i;
        for(i = oddnumbers.length - 1; i >= 0; i--) {
          System.out.println(oddnumbers[i]);
        }

          }
}
