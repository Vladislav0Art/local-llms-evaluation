package org.jsoup.parser;

public class GeneratedTestProcess_1 {

    @Test
    public void testProcess_1() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilderImpl();
        Token token = Token.StartTag("<root>", "/path/to/baseUri");
        xmlTreeBuilder.process(token);
        assert !xmlTreeBuilder.result.equals(null);
    }

}