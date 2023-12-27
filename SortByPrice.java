import java.util.Map;
import java.util.TreeMap;

public class SortByPrice {

    public static void main(String[] args) {

        String s = "samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA',20916,samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4',91995,samsung, 'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970,samsung,'Samsung DC97-17022B Assy Detergent',32959,samsung,'Samsung DC66-00470A DAMPER SHOCK',29981,samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150',52000,samsung,'Samsung DC97-16991A Assembly Filter',13000";

        int n = s.length();
        String resultString = new String();

        String[] splitWords = s.split(",");

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < splitWords.length; i++) {

            if (verifyIsNumber(splitWords[i])) {
                treeMap.put(Integer.valueOf(splitWords[i]), stringBuilder.toString());
                stringBuilder.setLength(0);
            } else {
                stringBuilder.append(splitWords[i]).append(",");
            }
        }

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            resultString += entry.getValue() + entry.getKey();
            resultString += "\n";
        }

        System.out.println(resultString);

    }

    public static boolean verifyIsNumber(String str) {
        int i = 0;
        while (i < str.length()) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }
}
