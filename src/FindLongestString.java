import java.util.ArrayList;

public class FindLongestString {
    String str;
    ArrayList<String> arrayList = new ArrayList<String>();

    public FindLongestString(String str) {
        this.str = str;
    }

    public String find() {
        for (int i = 0; i < str.length() - 1; i++) {
            String substr = new String() + str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                int iByInt = (int) str.charAt(i);
                int jByInt = (int) str.charAt(j);
                if (iByInt == jByInt) break;
                else if (iByInt > jByInt) continue;
                else {
                    substr += str.charAt(j);
                }
            }
            arrayList.add(substr);
        }

        int max = arrayList.get(0).length();
        int longestStringIndex = 0;
        for (int i = 1; i < arrayList.size(); i ++) {
            if (arrayList.get(i).length() > max) {
                max = arrayList.get(i).length();
                longestStringIndex = i;
            }
        }
        return arrayList.get(longestStringIndex);
    }
}