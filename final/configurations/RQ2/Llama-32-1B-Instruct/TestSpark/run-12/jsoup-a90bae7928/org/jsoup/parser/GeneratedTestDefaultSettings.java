package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestDefaultSettings {

    @Test
    public void testDefaultSettings() {
        String baseUri = "http://example.com";
        ParseSettings settings = new ParseSettings();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(settings);
        Document document = xmlTreeBuilder.parse(new StringReader(" <root><child>text</child></root>"));
        Assert.assertEquals(" http://example.com/", document.toString());
    }

}