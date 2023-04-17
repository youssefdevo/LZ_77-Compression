import java.util.ArrayList;

public class Compress {
    private String buffer = "",search = "";
    boolean enter = false;
    public ArrayList<String> compression(String input) {
        ArrayList<String>ans = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < input.length(); i++) {
            int index = buffer.lastIndexOf(search + input.charAt(i));
            if (index == -1) {
                if (i == input.length() - 1) enter = true;
                ans.add(c++,"<" + (buffer.length() - buffer.lastIndexOf(search)) + "," + (search.length()) + "," + input.charAt(i) + ">");
                buffer = buffer + search;
                buffer = buffer + input.charAt(i);
                search = "";
            } else {
                search = search + input.charAt(i);
            }
        }
        if (!enter) {
           ans.add(c,"<" + (buffer.length() - buffer.lastIndexOf(search)) + "," + (search.length()) + "," + "NULL" + ">");
        }
        return ans;
    }
}
