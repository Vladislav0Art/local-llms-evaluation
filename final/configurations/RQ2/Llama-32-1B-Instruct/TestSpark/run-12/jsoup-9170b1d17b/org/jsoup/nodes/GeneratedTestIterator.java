package org.jsoup.nodes;

public class GeneratedTestIterator {

    @Test
    public void testIterator() {
        Attributes attrs = new Attributes();
        Iterator<Attribute> iterator = attrs.iterator();
        while (iterator.hasNext()) {
            Assert.assertTrue(iterator.next().get("key1") == null);
        }
        Assert.assertFalse(iterator.hasNext());
    }

}