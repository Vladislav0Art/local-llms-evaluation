package org.jsoup.nodes;

public class GeneratedTestIterator {

    @Test
    public void testIterator() {
        Attributes attributes = new Attributes();
        String[] keys = {"key1", "key2"};
        Iterator<Attribute> iterator = attributes.iterator();
        for (int i = 0; i < keys.length; i++) {
            Attribute attribute = iterator.next();
            assertEquals(keys[i], attribute.getKey());
        }
    }

}