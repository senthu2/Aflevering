import javax.print.attribute.standard.Finishings;
import java.util.*;

public class HjemmeOpgaver {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ii");
        list.add("bobi");
        list.add("bobi");
        list.add("england");
        list.add("bobi");
        list.add("ii");

        //totalVowels(list);
        //System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(7);
        list1.add(3);
        list1.add(-1);
        list1.add(2);
        list1.add(3);
        list1.add(7);
        list1.add(2);
        list1.add(15);
        list1.add(15);

        //System.out.println(list1);
        // System.out.println(countUnique(list1));
        //minLength(list);
        // removeOddLength(list);
        System.out.println(contains3(list));
        contains3(list);


    }

    public static void totalVowels(ArrayList<String> list) {
        //Method for Counting number of vowels in String
        int count = 0;
        for (String word : list) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static int countUnique(ArrayList<Integer> list1) {
        int tal = 1;

        //Køre elementerne igennem en af gangen
        for (int i = 1; i < list1.size(); i++) {
            int j = 0;
            for (j = 0; j < i; j++)
                if (list1.get(i) == list1.get(j))
                    break;
            //Checker om der er nogle tal der er ens
            if (i == j)
                tal++;
        }
        return tal;
    }

    public static void minLength(ArrayList<String> list) {
        //Tager det første element i min Arraylist
        String smallest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            //Sammenligninger længden på min strings i mit Arraylist med det list.get(0);
            if (list.get(i).length() < smallest.length()) {
                smallest = list.get(i);
            }
        }
        System.out.println(smallest);

    }

    public static void removeOddLength(ArrayList<String> list) {

        //Oprettede en ny arraylist, da jeg fandt ud af med, når man bruger remove(), så rykke helle Arraylisten ind og det gav nogle problemer
        ArrayList<String> oddlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) { //længden er even

            } else // længden er odd
                oddlist.add(list.get(i));
        }
        System.out.println(oddlist);

    }

    public static boolean contains3(List<String> list) {
        //Fik den ikke til at virke
        int index = 0;
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(index).equals(list.get(i))) {
                ;
                System.out.println(map);
                index++;
                map.put(i, list.get(index));

            }
            if (map.size() >= 2) {
                return true;
            }
        }
        return false;
    }
}