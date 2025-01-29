package org.jsoup.helper;

public class GeneratedTestFromJsoupElement {

    @Test
    public void testFromJsoupElement() {
        org.jsoup.nodes.Element in = new Element("p");
        String result = org.jsoup.helper.W3CDom.fromJsoup(in);
        org.jsoup.nodes.Document doc = new Document();
        assertEquals(doc, result);
    }

}