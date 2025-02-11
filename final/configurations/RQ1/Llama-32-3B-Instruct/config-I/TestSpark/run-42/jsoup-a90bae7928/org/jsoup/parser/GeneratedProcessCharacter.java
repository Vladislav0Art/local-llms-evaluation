package org.jsoup.parser;

public class GeneratedProcessCharacter {

    private static final String XML_STRING = "<root><child>text</child></root>";
    private static final String EMPTY_STRING = "";
    private static final String DOCTYPE_STRING = "<!DOCTYPE root SYSTEM \"path/to/doctype\">";

    @Test
    public void processCharacter() {
        Token token = new Token(Token.Character.class, "Hello World");
        XmlTreeBuilder builder = new XmlTreeBuilder();
        boolean result = builder.process(token);
        assertTrue(result);
    }

}