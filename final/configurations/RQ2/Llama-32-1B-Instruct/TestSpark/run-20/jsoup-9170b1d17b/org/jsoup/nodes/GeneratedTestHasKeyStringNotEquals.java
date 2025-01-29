package org.jsoup.nodes;

public class GeneratedTestHasKeyStringNotEquals {

    @Test
    public void testHasKeyStringNotEquals() {
        Attributes attributes = new Attributes();
        String key = "key";
        Object value = true;
        assertEquals(true, attributes.hasKey(String.valueOf(key)));

        String key2 = "key2";
        Object value2 = false;
        assertEquals(false, attributes.hasKey(String.valueOf(key2)));
    }

}