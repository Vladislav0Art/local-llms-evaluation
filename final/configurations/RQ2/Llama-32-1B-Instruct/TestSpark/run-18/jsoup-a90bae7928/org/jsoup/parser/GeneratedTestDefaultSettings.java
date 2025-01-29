package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestDefaultSettings {

    @Test
    public void testDefaultSettings() {
        String baseUri = "http://example.com";
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings defaultSettings = new ParseSettings();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(defaultSettings, null, parser);
        Document document = xmlTreeBuilder.parse(new StringReader("<root><child>text</child></root>", baseUri));
    }

}