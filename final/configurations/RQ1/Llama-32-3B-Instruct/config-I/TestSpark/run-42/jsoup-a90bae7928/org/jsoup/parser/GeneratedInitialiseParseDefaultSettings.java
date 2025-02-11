package org.jsoup.parser;

public class GeneratedInitialiseParseDefaultSettings {

    private static final String XML_STRING = "<root><child>text</child></root>";
    private static final String EMPTY_STRING = "";
    private static final String DOCTYPE_STRING = "<!DOCTYPE root SYSTEM \"path/to/doctype\">";

    @Test
    public void initialiseParseDefaultSettings() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assert settings == ParseSettings.preserveCase;
    }

}