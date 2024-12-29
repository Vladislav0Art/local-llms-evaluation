package org.jsoup.parser;

public class GeneratedParse_WithValidInputFragment_ReturnsDocument {

    @Test
    public void parse_WithValidInputFragment_ReturnsDocument() {
        String inputFragment = "<html><body>Hello World!</body></html>";
        Document document = new XmlTreeBuilder().parse(inputFragment, null);
        assertNotNull(document);
    }

}