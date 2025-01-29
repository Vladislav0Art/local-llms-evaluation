package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInsertNodeWithTokenCharacter {

    @Test
    public void testInsertNodeWithTokenCharacter() {
        String baseUri = "http://example.com";
        ParseSettings settings = new ParseSettings();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(settings);
        Node node = xmlTreeBuilder.parse(new StringReader(" <root><child>text</child></root>"));
        Element element = (Element) xmlTreeBuilder.insert(node).get();
        Assert.assertEquals(" http://example.com/", element.toString());
    }

}