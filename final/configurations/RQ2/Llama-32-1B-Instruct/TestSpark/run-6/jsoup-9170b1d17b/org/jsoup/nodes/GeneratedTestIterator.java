package org.jsoup.nodes;

public class GeneratedTestIterator {

    @Test
    public void testIterator() {
        Attributes attributes = new Attributes();
        String value = "value";
        attributes.add("key", value);
        Iterator<Attribute> iterator = attributes.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next().getValue());
        assertFalse(iterator.hasNext());
    }

}