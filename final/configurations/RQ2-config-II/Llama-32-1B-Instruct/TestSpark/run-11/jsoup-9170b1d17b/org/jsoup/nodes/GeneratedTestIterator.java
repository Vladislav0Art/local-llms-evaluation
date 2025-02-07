package org.jsoup.nodes;

public class GeneratedTestIterator {

    @Test
    public void testIterator() {
        Attributes attributes = new Attributes();
        Iterator<Attribute> iterator = attributes.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(attributes.get("key"), iterator.next().get("key"));
        assertFalse(iterator.hasNext());
    }

}