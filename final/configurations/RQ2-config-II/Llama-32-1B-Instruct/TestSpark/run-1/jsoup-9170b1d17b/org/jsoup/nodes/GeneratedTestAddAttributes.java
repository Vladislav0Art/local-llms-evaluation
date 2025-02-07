package org.jsoup.nodes;

public class GeneratedTestAddAttributes {

    @Test
    public void testAddAttributes() {
        Attributes attributes1 = new Attributes();
        attributes1.add("test", "value");
        String key = "test";
        Object value = null;
        attributes1.put(String.valueOf(key), value);
        assertEquals(value, attributes1.getUserData(key));
    }

}