package org.jsoup.nodes;

public class GeneratedTestAddAll {

    @Test
    public void testAddAll() {
        Attributes attributes = new Attributes();
        List<Attribute> incomingAttributes = Arrays.asList(new Attribute("key1", "value1"), new Attribute("key2", "value2"));
        attributes.addAll(incomingAttributes);
        assertEquals(2, attributes.size());
    }

}