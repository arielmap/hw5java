import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class task1
{
    public static void main(String[] args)
    {
        Map<String, List<String>> phoneBook = new HashMap<>();
        addInPhoneBook(phoneBook);
        findInPhoneBook("Петров", phoneBook);
    }

    public static void addInPhoneBook(Map<String, List<String>> phoneBook)
    {
        phoneBook.put("Иванов", List.of("+7(111)111-11-11", "+7(222)222-22-22"));
        phoneBook.put("Петров", List.of("+7(333)333-33-33", "+7(444)444-44-44"));
        phoneBook.put("Сидоров",List.of("+7(555)555-55-55", "+7(666)666-66-66"));
    }

    public static void findInPhoneBook(String surname, Map<String, List<String>> phoneBook)
    {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}