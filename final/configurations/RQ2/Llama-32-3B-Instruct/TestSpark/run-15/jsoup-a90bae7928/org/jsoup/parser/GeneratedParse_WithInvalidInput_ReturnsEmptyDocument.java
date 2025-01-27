package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class GeneratedParse_WithInvalidInput_ReturnsEmptyDocument {

    @Mock
    private java.io.Reader inputReader;

    @Test
    public void parse_WithInvalidInput_ReturnsEmptyDocument() {
        Document document = new Document();
        when(xmlTreeBuilder.parser.parse((java.io.Reader) null)).thenReturn(document);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document resultDocument = xmlTreeBuilder.parse((java.io.Reader) null, null);
        Mockito.verify(null).parse((java.io.Reader) null);
    }

}