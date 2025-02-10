package org.jsoup.nodes;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        // Test the equals method
        Attributes attributes = new Attributes(Arrays.asList(
                "key1", "value1",
                "key2", null,
                "key3", "value3"
        ));
        String expectedValue = Arrays.asList(
                "key1", "value1",
                "key2", "value3"
        );
        assertEquals(expectedValue, attributes.equals(null));
    }

}