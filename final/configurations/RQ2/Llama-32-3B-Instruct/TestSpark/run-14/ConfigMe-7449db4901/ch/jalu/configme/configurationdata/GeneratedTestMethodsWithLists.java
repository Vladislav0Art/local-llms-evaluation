package ch.jalu.configme.configurationdata;

public class GeneratedTestMethodsWithLists {

    public static void main(String[] args) {
        int[] array = {1, 2};
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
    }
}

public class MethodsWithLists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        assertEquals(1, initListWithValues(list));
        assertEquals(2, initListWithValues(list));
    }

    public static int initListWithValues(List<String> list) {
        list.add("value1");
        list.add("value2");
        return list.size();
    }
}

public class GeneratedTest {

    @Test
    public void testMethodsWithLists() {
        new MethodsWithLists().main(null);
    }

}