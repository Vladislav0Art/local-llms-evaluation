package org.jsoup.parser;

public class GeneratedTestInsertFragment_2 {

    @Test
    public void testInsertFragment_2() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilderImpl();
        Document document = xmlTreeBuilder.parse("", "", "http://example.com/baseUri").document(0);
        List<Node> nodes = xmlTreeBuilder.parseFragment("<fragment>", "", "http://example.com/baseUri", null).nodes();
        assert !xmlTreeBuilder.result.equals(null);
    }

}