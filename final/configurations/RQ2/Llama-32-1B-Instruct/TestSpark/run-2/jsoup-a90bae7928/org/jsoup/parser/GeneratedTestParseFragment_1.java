package org.jsoup.parser;

public class GeneratedTestParseFragment_1 {

    @Test
    public void testParseFragment_1() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilderImpl();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<fragment>", "", "http://example.com/baseUri", null).nodes();
        assert !xmlTreeBuilder.result.equals(null);
    }

}