package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInitialiseParseWithEmptyBaseUri {

    @Test
    public void testInitialiseParseWithEmptyBaseUri() {
        String input = "<root><child>text</child></root>";
        ParseSettings settings = new ParseSettings();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(settings);
        Document document = xmlTreeBuilder.parse(input, "");
        Assert.assertEquals("", document.toString());
    }

}