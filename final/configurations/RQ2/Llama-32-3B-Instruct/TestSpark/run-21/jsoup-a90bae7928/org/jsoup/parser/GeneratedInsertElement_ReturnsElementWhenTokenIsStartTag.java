package org.jsoup.parser;

public class GeneratedInsertElement_ReturnsElementWhenTokenIsStartTag {

    @Test
    public void insertElement_ReturnsElementWhenTokenIsStartTag() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        Element element = builder.insert(startTag);
        Assert.assertNotNull(element);
    }

}