package org.jsoup.parser;

public class GeneratedTestParseFragment_2 {

    @Test
    public void testParseFragment_2() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilderImpl();
        List<Node> nodes = xmlTreeBuilder.parse("<fragment>", "", "http://example.com/baseUri", null).nodes();
        assert !xmlTreeBuilder.result.equals(null);
    }

}