package org.jsoup.nodes;

public class GeneratedTestAsList {

    @Test
    public void testAsList() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.put("key", value);
        List<Attribute> list = attributes.asList();
        assertEquals(1, list.size());
        assertTrue(list.get(0).getValue().equals(value));
    }

}