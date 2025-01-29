package org.jsoup.nodes;

public class GeneratedTestHasKeyStringEquals {

    @Test
    public void testHasKeyStringEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = true;

        assertEquals(true, attributes.hasKeyIgnoreCase(String.valueOf(key)));

        String key2 = "key2";
        Object value2 = false;
        assertEquals(false, attributes.hasKeyIgnoreCase(String.valueOf(key2)));
    }

}