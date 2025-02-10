package org.jsoup.nodes;

public class GeneratedTestRemoveEmptyAttribute {

    @Test
    public void testRemoveEmptyAttribute() {
        // Test the remove method with an empty key
        Attributes attributes = new Attributes(Arrays.asList(
                "", null,
                "key3", "value3"
        ));
        int expectedValue = 0;
        assertEquals(expectedValue, attributes.remove("key3"));
    }

}