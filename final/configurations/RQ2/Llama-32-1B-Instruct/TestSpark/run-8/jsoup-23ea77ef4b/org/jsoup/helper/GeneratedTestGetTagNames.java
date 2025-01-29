package org.jsoup.helper;

public class GeneratedTestGetTagNames {

    @Test
    public void testGetTagNames() {
        String doc = "<html><head><title>Home Page</title></head><body>Hello World!</body></html>";
        org.jsoup.nodes.Document docObj = new org.jsoup.nodes.Document(doc);
        Map<String, String> tagNames = W3CElementHelper.getTagsMap();
        assertEquals(docObj.select("body").size() + 1, tagNames.size());
    }

}