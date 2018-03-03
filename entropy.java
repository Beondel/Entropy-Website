public class Entropy {
    public static void main(String[] args) {
        String data = "a A";
        System.out.println()
    }

    public double entropy(String data) {
        data = data.replaceAll(" ", "");
        char[] chars = data.toCharArray();
        int[] ints = new int[chars.length]
        for (int i = 0; i < chars.length; i++) {
            ints[i] = (int) chars[i];
        }

    }

}
