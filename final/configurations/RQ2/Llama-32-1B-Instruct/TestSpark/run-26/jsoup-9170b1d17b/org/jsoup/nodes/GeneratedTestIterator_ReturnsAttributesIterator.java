package org.jsoup.nodes;

public class GeneratedTestIterator_ReturnsAttributesIterator {

    private Attributes attributes;

    @Test
    public void testIterator_ReturnsAttributesIterator() {
        String key = "key1";
        Object value = null;
        attributes.put(key, value);
        Iterator<Attribute> iterator = attributes.iterator();
        assertNotNull(iterator);
        while (iterator.hasNext()) {
            Attribute attribute = iterator.next();
            assertTrue(attribute instanceof Attribute);
        }
    }

}