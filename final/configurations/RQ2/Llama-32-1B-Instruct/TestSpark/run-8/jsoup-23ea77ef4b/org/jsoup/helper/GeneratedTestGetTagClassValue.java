package org.jsoup.helper;

public class GeneratedTestGetTagClassValue {

    @Test
    public void testGetTagClassValue() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        assertEquals(null, W3CElementHelper.getTagsMap().get("class").toString());
    }

}