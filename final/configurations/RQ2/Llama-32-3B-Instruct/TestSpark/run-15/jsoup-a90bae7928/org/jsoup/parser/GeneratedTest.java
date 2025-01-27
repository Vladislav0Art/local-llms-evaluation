package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class GeneratedTest {

    @Mock
    private java.io.Reader inputReader;

    @Test
    public void initialiseParse_WithValidInput_CallsInitializeWithReader() {
        when(inputReader.read()).thenReturn(10);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(inputReader, null, null);
        Mockito.verify(null).initialiseWithReader(inputReader);
    }

    @Test
    public void initialiseParse_WithInvalidInput_ThrowsException() {
        when(inputReader.read()).thenReturn(-1);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        try {
            xmlTreeBuilder.initialiseParse(inputReader, null, null);
            assert false;
        } catch (Exception e) {
            Mockito.verify(null).initialiseWithReader(inputReader);
        }
    }

    @Test
    public void parse_WithValidInput_ReturnsDocument() {
        Document document = new Document();
        when(xmlTreeBuilder.parser.parse(inputReader)).thenReturn(document);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document resultDocument = xmlTreeBuilder.parse((java.io.Reader) null, null);
        Mockito.verify(null).parse(inputReader);
    }

    @Test
    public void parse_WithInvalidInput_ReturnsEmptyDocument() {
        Document document = new Document();
        when(xmlTreeBuilder.parser.parse((java.io.Reader) null)).thenReturn(document);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document resultDocument = xmlTreeBuilder.parse((java.io.Reader) null, null);
        Mockito.verify(null).parse((java.io.Reader) null);
    }

    @Test
    public void objectEquals() {
        boolean result = false;
        result = false;
        Mockito.verify(null).equals(null);
    }
}

public class XmlTreeBuilder {

    private java.io.Reader inputReader;

    public void initialiseParse(java.io.Reader reader) {
        this.inputReader = reader;
    }

    public Document parse(java.io.Reader reader) {
        return null;
    }

}