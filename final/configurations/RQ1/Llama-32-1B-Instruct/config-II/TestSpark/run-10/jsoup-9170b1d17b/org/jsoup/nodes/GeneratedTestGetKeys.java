package org.jsoup.nodes;

public class GeneratedTestGetKeys {

    @Test
    public void testGetKeys() {
        // Test the getKeys method
        Attributes attributes = new Attributes(Arrays.asList(
                "key1", "value1",
                "key2", null,
                "key3", "value3"
        ));
        String expectedValue = Arrays.asList(
                "key1", "key2", "key3"
        );
        assertEquals(expectedValue, attributes.getKeys());
    }

}