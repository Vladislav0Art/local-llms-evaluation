package org.jsoup.helper;

public class GeneratedFromJsoupWithElement {

    private static org.jsoup.nodes.Document document;
    private static org.jsoup.nodes.Document output;

    @Test
    public void fromJsoupWithElement() {
        org.jsoup.nodes.Element in = new DocumentBuilderFactory.newInstance().newDocumentBuilder().build("<html><body><p>Hello World!</p></body></html>");
        document = W3CDom.fromJsoup(in);
        output = W3CDom.fromJsoup(document);
        assertEquals(in, output);
    }

}