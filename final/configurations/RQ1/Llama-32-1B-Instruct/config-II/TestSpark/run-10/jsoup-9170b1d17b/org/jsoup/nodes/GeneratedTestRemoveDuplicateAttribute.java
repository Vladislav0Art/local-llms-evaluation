package org.jsoup.nodes;

public class GeneratedTestRemoveDuplicateAttribute {

    @Test
    public void testRemoveDuplicateAttribute() {
        // Test the removeDuplicate method
        Attributes attributes = new Attributes(Arrays.asList(
                "key1", "value1",
                "key2", null,
                "key3", "value3"
        ));
        int expectedValue = 0;
        assertEquals(expectedValue, attributes.removeDuplicate("key1"));
    }

}