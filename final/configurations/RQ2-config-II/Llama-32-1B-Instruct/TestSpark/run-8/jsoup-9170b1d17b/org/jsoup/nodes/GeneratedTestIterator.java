package org.jsoup.nodes;

public class GeneratedTestIterator {

    @Test
    public void testIterator() {
        Attributes attrs = new Attributes();
        Iterator<Attribute> iterator = attrs.iterator();
        assertTrue(iterator.hasNext());
        Assert.assertFalse(iterator.next().equals(attrs));
    }

}