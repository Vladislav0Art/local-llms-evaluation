package org.jsoup.helper;

public class GeneratedTestGetTagAttributes {

    @Test
    public void testGetTagAttributes() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        Map<String, Object> tagAttributes = W3CElementHelper.getTagsMap();
        assertEquals("title", tagAttributes.get("title"));
    }

}