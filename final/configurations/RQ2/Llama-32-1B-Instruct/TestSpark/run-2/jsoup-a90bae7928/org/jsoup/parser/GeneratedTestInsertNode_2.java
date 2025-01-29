package org.jsoup.parser;

public class GeneratedTestInsertNode_2 {

    @Test
    public void testInsertNode_2() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilderImpl();
        Element element = xmlTreeBuilder.parseFragment("<fragment>", "", "http://example.com/baseUri", null).element(0);
        assert !xmlTreeBuilder.result.equals(null);
    }

}