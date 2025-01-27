package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class GeneratedInitialiseParse_WithValidInput_CallsInitializeWithReader {

    @Mock
    private java.io.Reader inputReader;

    @Test
    public void initialiseParse_WithValidInput_CallsInitializeWithReader() {
        when(inputReader.read()).thenReturn(10);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(inputReader, null, null);
        Mockito.verify(null).initialiseWithReader(inputReader);
    }

}