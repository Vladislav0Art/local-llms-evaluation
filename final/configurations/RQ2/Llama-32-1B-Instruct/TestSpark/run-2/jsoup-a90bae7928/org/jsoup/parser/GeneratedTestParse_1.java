package org.jsoup.parser;

public class GeneratedTestParse_1 {

    @Test
    public void testParse_1() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilderImpl();
        Document document = xmlTreeBuilder.parse("", "", "http://example.com/baseUri").document(0);
        assert !xmlTreeBuilder.result.equals(null);
    }

}