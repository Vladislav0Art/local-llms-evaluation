package org.jsoup.helper;

public class GeneratedTestGetTagValues {

    @Test
    public void testGetTagValues() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        Map<String, Object> tagValues = W3CElementHelper.getTagsMap();
        assertEquals("Hello World!", tagValues.get("text"));
    }

}