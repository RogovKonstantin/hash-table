public class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> table = new HashTable<>();

        table.add("A", 1);
        table.add("B", 2);
        table.add("C", 3);
        table.add("D", 4);
        table.add("E", 1);
        table.add("F", 2);
        table.add("G", 3);
        table.add("H", 4);
        table.add("I", 1);
        table.add("J", 2);
        table.add("K", 3);
        table.add("L", 4);

        System.out.println(table);

        for (KeyValue<String, Integer> entry : table) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        Iterable<String> keys = table.keys();
        System.out.println("ключи" + keys);

        Iterable<Integer> values = table.values();
        System.out.println("значения" + values);

        System.out.println("изменение значения");
        table.addOrReplace("G", 0);
        System.out.println(table);

        System.out.println("нахождение значения по ключу");
        System.out.println(table.get("C"));
        System.out.println("ключ-значение по ключу");
        System.out.println(table.find("D"));

        System.out.println("проверка на наличие ключа");
        System.out.println(table.containsKey("Z"));
        System.out.println("удаление по ключу");
        System.out.println(table.remove("B"));
        System.out.println(table);
        System.out.println(table.size());

        System.out.println("чистка таблицы");
        table.clear();
        System.out.println(table);
        System.out.println(table.size());


    }
}