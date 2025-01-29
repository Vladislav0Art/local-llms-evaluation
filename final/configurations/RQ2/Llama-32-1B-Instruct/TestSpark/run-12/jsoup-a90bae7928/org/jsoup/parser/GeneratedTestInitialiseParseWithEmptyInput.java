package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInitialiseParseWithEmptyInput {

    @Test
    public void testInitialiseParseWithEmptyInput() {
        String baseUri = "";
        ParseSettings settings = new ParseSettings();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(settings);
        Document document = xmlTreeBuilder.parse(new StringReader(""));
        Assert.assertEquals("", document.toString());
    }

}