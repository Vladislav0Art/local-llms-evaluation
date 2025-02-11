package org.jsoup.parser;

public class GeneratedParseEmptyString {

    private static final String XML_STRING = "<root><child>text</child></root>";
    private static final String EMPTY_STRING = "";
    private static final String DOCTYPE_STRING = "<!DOCTYPE root SYSTEM \"path/to/doctype\">";

    @Test
    public void parseEmptyString() {
        Assert nullValue (XmlTreeBuilder.parse(EMPTY_STRING, ""));
    }

}