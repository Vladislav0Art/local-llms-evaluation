package org.jsoup.helper;

public class GeneratedSelectXpath {

    private static org.jsoup.nodes.Document document;
    private static org.jsoup.nodes.Document output;

    @Test
    public void selectXpath() {
        org.jsoup.nodes.Document doc = new DocumentBuilder().build("<html><body><p>Hello World!</p></body></html>");
        NodeList list = document.select("p");
        assertEquals(1, list.getLength());
        String xpath = "p";
        output = W3CDom.SelectXpath(xpath, doc);
        System.out.println(output.toString());
    }

}