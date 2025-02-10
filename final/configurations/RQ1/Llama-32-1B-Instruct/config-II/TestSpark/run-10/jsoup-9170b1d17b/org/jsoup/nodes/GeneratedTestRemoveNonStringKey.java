package org.jsoup.nodes;

public class GeneratedTestRemoveNonStringKey {

    @Test
    public void testRemoveNonStringKey() {
        // Test the remove method with a non-string key
        Attributes attributes = new Attributes(Arrays.asList(
                "key1", null,
                "key2", "value"
        ));
        int expectedValue = 0;
        assertEquals(expectedValue, attributes.remove("non_string_key"));
    }

}