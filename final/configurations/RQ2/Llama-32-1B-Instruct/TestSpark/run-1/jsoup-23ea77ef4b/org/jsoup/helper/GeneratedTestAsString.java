package org.jsoup.helper;

public class GeneratedTestAsString {

    @Test
    public void testAsString() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        String asString = instance.asString(document);
        assert asString.equals("<html><body>Hello World!</body></html>");
    }

}