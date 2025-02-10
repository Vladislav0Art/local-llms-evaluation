package org.jsoup.nodes;

public class GeneratedTestGetMapValues {

    @Test
    public void testGetMapValues() {
        // Test the getMapValues method
        Attributes attributes = new Attributes(Arrays.asList(
                "key1", "value1",
                "key2", null,
                "key3", "value3"
        ));
        String expectedValue = Arrays.asList(
                "value1",
                ""
        );
        assertEquals(expectedValue, attributes.getMapValues());
    }

}