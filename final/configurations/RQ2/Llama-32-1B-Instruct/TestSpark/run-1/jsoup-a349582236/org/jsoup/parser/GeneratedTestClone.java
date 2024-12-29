package org.jsoup.parser;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Tag tag1 = new TagImpl();
        Tag tag2 = new TagImpl();
        tag1.setSelfClosing(true);
        tag2.clone().setName("tag");
        assertEquals(tag2, tag1.clone());
    }

}