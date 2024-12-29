package org.jsoup.nodes;

public class GeneratedTestIterator {

    @Test
    public void testIterator() {
        Attributes attributes = new Attributes();
        String key = "key";
        String value = "value";
        attributes.put(key, value);
        Iterator<Attribute> iterator = attributes.iterator();
        while (iterator.hasNext()) {
            assertEquals("key", iterator.next().getKey());
            assertEquals(value, iterator.next().getValue());
        }
    }

}