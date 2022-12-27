import java.util.*;


public class task2
{
    public static void main(String[] args)
    {
        Map<Integer, String> entryList = new HashMap<>();
        entryList.put(1, "Дима");
        entryList.put(2, "Вова");
        entryList.put(3, "Дима");
        entryList.put(4, "Дима");
        entryList.put(5, "Вова");
        entryList.put(6, "Сережа");

        countOfNames(entryList);
    }

    public static void countOfNames(Map<Integer, String> entryList)
    {
        List<String> list = new ArrayList<>(entryList.values());
        Map<Integer, String> states = new HashMap<>();
        Integer count = 0;
        for (int i = 0; i < list.size(); i++)
        {
            count = 0;
            for (int j = 0; j < list.size(); j++)
            {
                if (list.get(i) == list.get(j))
                {
                    count++;
                    states.put(count, list.get(i));
                }
            }
        }
        System.out.println(states);
        ArrayList<Integer> keys = new ArrayList<>(states.keySet());
        for (int i = keys.size() - 1; i >= 0; i--)
        {
            System.out.println(states.get(keys.get(i)));
        }
    }
}