package ch.jalu.configme.configurationdata;

public class GeneratedGetRootEntriesTest {

    boolean equals(Object obj);
}

public class MockProperty implements Property {
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class ListUtils {
    public static <T> T[] createArray(T[] array) {
        return array;
    }

    public static void assertListEquals(List<MockProperty> expected, List<MockProperty> actual) {
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertTrue(actual.get(i).equals(expected.get(i)));
        }
    }
}

public class PropertyListBuilderTest {

    @Test
    public void getRootEntriesTest() {
        Map<String, Object> entries = new LinkedHashMap<>();
        new PropertyListBuilder().getRootEntries().put("test", "value");
        assertEquals(1, ((LinkedHashMap<String, Object>) new PropertyListBuilder().getRootEntries()).size());
    }

}