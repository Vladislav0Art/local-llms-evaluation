package ch.jalu.configme.configurationdata;

public class GeneratedTestInitArrayWithValues {

    @Test
    public void testInitArrayWithValues() {
        int[] array = initArrayWithValues(2);
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
    }
}

public class MethodsWithLists {

    public static List<String> initListWithValues(int size) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add("value" + i);
        }
        return list;
    }

}