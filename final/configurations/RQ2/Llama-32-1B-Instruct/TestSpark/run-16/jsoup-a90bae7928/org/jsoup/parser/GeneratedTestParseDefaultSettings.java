package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseDefaultSettings {

    @Test
    public void testParseDefaultSettings() {
        String input = "<root><a/> <b/></root>";
        Document document = new XmlTreeBuilder().defaultSettings(input).parse(input);
        Mockito.verify(document, Mockito.times(2)).appendText(Mockito.anyString());
    }

}