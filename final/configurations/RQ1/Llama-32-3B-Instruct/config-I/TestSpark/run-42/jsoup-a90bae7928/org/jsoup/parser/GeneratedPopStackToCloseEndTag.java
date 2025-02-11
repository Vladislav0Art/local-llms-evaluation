package org.jsoup.parser;

public class GeneratedPopStackToCloseEndTag {

    private static final String XML_STRING = "<root><child>text</child></root>";
    private static final String EMPTY_STRING = "";
    private static final String DOCTYPE_STRING = "<!DOCTYPE root SYSTEM \"path/to/doctype\">";

    @Test
    public void popStackToCloseEndTag() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element element = new Element("root", null, null);
        builder.stack.add(element);
        Token token = new Token(Token.EndTag.class, "root");
        builder.popStackToClose(token);
        assertEquals(0, builder.stack.size());
    }

}