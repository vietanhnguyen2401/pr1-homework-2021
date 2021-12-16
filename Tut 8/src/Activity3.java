import java.util.ArrayList;
public class Activity3 {
    public static void main (String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("jk");
        list.add("def");
        list.add("gh");
        removeEvenLength(list);
        for (int i =0;i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static void removeEvenLength(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() % 2 == 0) {
                list.remove(s);
            }
        }
    }
}
