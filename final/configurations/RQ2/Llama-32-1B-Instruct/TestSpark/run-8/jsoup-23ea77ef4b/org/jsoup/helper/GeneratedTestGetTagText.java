package org.jsoup.helper;

public class GeneratedTestGetTagText {

    @Test
    public void testGetTagText() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        assertEquals("Hello World!", W3CElementHelper.getTagsMap().get("text"));
    }

}