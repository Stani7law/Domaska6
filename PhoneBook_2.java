import java.util.*;



public class PhoneBook_2 {

    private HashMap<String, List<String>> phoneBook;

    public PhoneBook_2(){
        phoneBook = new HashMap<>();
    }


    public void insert(String name, String phoneNumber){
        List<String> numbers = phoneBook.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(name,numbers);
    }

                //Сортировка по убыванию числа телефонов
    public void display(){
        List<Map.Entry<String, List<String>>> sortedEntries =  new ArrayList<>(phoneBook.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());


        for (Map.Entry<String, List<String>> entry : sortedEntries){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook_2 phoneBook = new PhoneBook_2();
        phoneBook.insert("Stanislav", "548651685");
        phoneBook.insert("Stanislav", "456786456");
        phoneBook.insert("Dima", "2353878698");
        phoneBook.insert("Vera", "4587678637");
        phoneBook.insert("Agata", "6937375575");

        phoneBook.display();
    }


}

