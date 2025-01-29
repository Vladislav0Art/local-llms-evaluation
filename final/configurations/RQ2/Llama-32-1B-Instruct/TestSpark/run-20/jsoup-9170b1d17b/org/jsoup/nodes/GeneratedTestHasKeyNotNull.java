package org.jsoup.nodes;

public class GeneratedTestHasKeyNotNull {

    @Test
    public void testHasKeyNotNull() {
        Attributes attributes = new Attributes();
        String key = "key";
        boolean value = true;
        assertEquals(true, attributes.hasKey(key));

        String key2 = "key2";
        boolean value2 = false;
        assertEquals(false, attributes.hasKey(key2));
    }

}