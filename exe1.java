import java.util.*;

public class exe1 {
    public static void main(String[] args) {
        ArrayList<String> stringarray = new ArrayList<>();
        stringarray,add("Hello");
        stringarray.add(0, "World");
        System.out.println(stringarray);
        for (int i = 0; i < stringarray.size(); i++) {
            System.out.print(stringarray.get(i)+" ");
        }
        stringarray.remove(0);
        System.out.println(stringarray);
        System.out.println();
        ArrayList<Integer> arr = createList1(5);
        Dby5(arr);

    }
    //To create list with n elements
    public static ArrayList<Integer> createList1(int n){
        ArrayList<Integer> L = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            L.add(sc.nextInt());
        }
        return L;

    }
    //method for Exe1
    public static void Dby5(ArrayList<Integer> l){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            if(l.get(i)%5==0){
                newList.add(l.get(i));
            }
        }
        Collections.sort(newList);
        System.out.println(newList);
    }
}
class Rivers{
    public static void printRivers(){
        String[] rivers = {"Volga", "Ottawa", " Danube", "Colorado", "Nile", "Dniester", "Ural", "Amazon", "Missisipi", "Dneper"};
        Integer[] lengths = {3645, 1271, 2888, 2333, 6650, 1411, 2428, 6575, 6275, 2287};
        List<String> riversList = Array.asList(rivers);
        List<Integer> lenghtList = Array.asList(lengths);
        List<Integer> temp_lengths = new ArrayList<>(lengthsList);
        //Copy elements from lenghtlist to temp_list
        Collections.copy(temp_lenghts,lenghtlist);
        Collection.sort(lenghtList);
        //finallist is list of the rivers sorted by lenghts
        ArrayList<String> finalList = new ArrayList<>();
        for (Integer elements: lenghtList){
            finalList.add(riversList.get(temp_lengths.indexOf(elements)));
        }
        System.out.println(finalList);
    }
}
