package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class GeneratedParse_WithValidInput_ReturnsDocument {

    @Mock
    private java.io.Reader inputReader;

    @Test
    public void parse_WithValidInput_ReturnsDocument() {
        Document document = new Document();
        when(xmlTreeBuilder.parser.parse(inputReader)).thenReturn(document);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document resultDocument = xmlTreeBuilder.parse((java.io.Reader) null, null);
        Mockito.verify(null).parse(inputReader);
    }

}