package org.jsoup.nodes;

public class GeneratedTestGetValues {

    @Test
    public void testGetValues() {
        // Test the getValues method
        Attributes attributes = new Attributes(Arrays.asList(
                "key1", "value1",
                "key2", null,
                "key3", "value3"
        ));
        String expectedValue = Arrays.asList(
                "value1",
                "null",
                "value3"
        );
        assertEquals(expectedValue, attributes.getValues());
    }

}