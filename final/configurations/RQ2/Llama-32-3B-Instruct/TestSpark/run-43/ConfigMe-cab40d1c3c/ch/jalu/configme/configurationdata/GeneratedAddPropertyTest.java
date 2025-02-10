package ch.jalu.configme.configurationdata;

public class GeneratedAddPropertyTest {

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
    public void addPropertyTest() {
        MockProperty property = new MockProperty();
        new PropertyListBuilder().add(property);
        ListUtils.assertListEquals(new PropertyListBuilder().create(), Collections.singletonList(property));
    }

}