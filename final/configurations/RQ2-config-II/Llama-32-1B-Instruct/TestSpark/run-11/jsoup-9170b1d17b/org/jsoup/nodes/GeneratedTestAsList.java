package org.jsoup.nodes;

public class GeneratedTestAsList {

    @Test
    public void testAsList() {
        Attributes attributes = new Attributes();
        List<Attribute> list = attributes.asList();
        assertTrue(list.contains(attributes.get("key")));
        assertFalse(list.contains(attributes.getUserData("keyElseValue")));
    }

}