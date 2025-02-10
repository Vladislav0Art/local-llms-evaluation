package org.jsoup.nodes;

public class GeneratedTestSetKey {

    @Test
    public void testSetKey() {
        // Test the set method with a non-empty key
        Attributes attributes = new Attributes(Arrays.asList(
                "", null,
                "key3", "value"
        ));
        String value = "new_value";
        String expectedValue = Arrays.asList(
                "", "null",
                "key3", value
        );
        assertEquals(expectedValue, attributes.set("key1", value));
    }

}