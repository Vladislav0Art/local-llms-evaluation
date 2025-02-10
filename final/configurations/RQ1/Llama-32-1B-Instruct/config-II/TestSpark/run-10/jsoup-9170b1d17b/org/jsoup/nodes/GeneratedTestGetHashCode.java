package org.jsoup.nodes;

public class GeneratedTestGetHashCode {

    @Test
    public void testGetHashCode() {
        // Test the hashCode method
        Attributes attributes = new Attributes(Arrays.asList(
                "key1", "value1",
                "key2", null,
                "key3", "value3"
        ));
        String expectedValue = 0;
        assertEquals(expectedValue, attributes.hashCode());
    }

}