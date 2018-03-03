import java.util.*;

public class Entropy {
    public static void main(String[] args) {
        String data = "AB";
        System.out.println(entropy(data));
    }

    public static double entropy(String data) {
        data = data.replaceAll(" ", "");
        char[] chars = data.toCharArray();
        int[] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ints[i] = (int) chars[i];
        }
        Map<Integer, Double> probMap = new HashMap<Integer, Double>();
        for (int i = 0; i < ints.length; i++) {
            if (!probMap.containsKey(ints[i])) {
                probMap.put(ints[i], 1.0 / ints.length);
            } else {
                double numerator = probMap.get(ints[i]) * ints.length + 1;
                probMap.put(ints[i], numerator / ints.length);
            }
        }
        double entropy = 0.0;
        for (Integer i : probMap.keySet()) {
            double p = probMap.get(i);
            entropy -= p * (Math.log10(p) / Math.log10(2));
        }
        return entropy;
    }

}
