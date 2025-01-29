package org.jsoup.helper;

public class GeneratedTestFromJsoup {

    @Test
    public void testFromJsoup() {
        org.jsoup.nodes.Document in = new Document();
        String result = org.jsoup.helper.W3CDom.fromJsoup(in);
        org.jsoup.nodes.Document doc = new Document();
        assertEquals(doc, result);
    }

}