package org.jsoup.nodes;

public class GeneratedTestIterator {

    private static final Document document = new Document();

    @Test
    public void testIterator() {
        String key = "test";
        Attributes attributes = new Attributes(document);
        Iterator<Attribute> iterator = attributes.iterator();
        assertEquals(0, iterator.hasNext());
        assertFalse(iterator.hasNext());

        for (int i = 1; i <= attributes.size(); i++) {
            assertTrue(attributes.get(i) != null);
        }
    }

}