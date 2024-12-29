package org.jsoup.parser;

public class GeneratedInsertStartTag_AddsCorrectly {

    @Test
    public void insertStartTag_AddsCorrectly() {
        Token.StartTag startTag = new Token.StartTag();
        Element element = new XmlTreeBuilder().insert(startTag);
        assertNotNull(element);
    }

}