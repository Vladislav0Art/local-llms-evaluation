package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private int[] array = {1, 2};

    public void testMethod() {
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
    }

    public static void main(String[] args) {
        new MethodsWithArrays().testMethod();
    }
}

public class MethodsWithLists {
    private List<String> list = new ArrayList<>();

    public int initListWithValues() {
        list.add("value1");
        list.add("value2");
        return list.size();
    }

    public static void main(String[] args) {
        new MethodsWithLists().initListWithValues();
    }
}

public class GeneratedTest {

}