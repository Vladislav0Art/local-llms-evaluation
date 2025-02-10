package ch.jalu.configme.configurationdata;

public class GeneratedAddMultiplePropertiesTest {

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
    public void addMultiplePropertiesTest() {
        MockProperty property1 = new MockProperty();
        MockProperty property2 = new MockProperty();
        new PropertyListBuilder().add(property1).add(property2);
        ListUtils.assertListEquals(new PropertyListBuilder().create(), Arrays.asList(property1, property2));
    }

}