package org.jsoup.helper;

public class GeneratedTestAsString {

    @Test
    public void testAsString() {
        org.jsoup.nodes.Document doc = new Document();
        String result = org.jsoup.helper.W3CDom.asString(doc, null);
        assertEquals("<html>", result);
    }

}