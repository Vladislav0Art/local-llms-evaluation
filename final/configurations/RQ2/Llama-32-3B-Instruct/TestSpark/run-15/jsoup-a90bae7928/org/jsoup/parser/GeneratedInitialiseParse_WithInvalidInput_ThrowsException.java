package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class GeneratedInitialiseParse_WithInvalidInput_ThrowsException {

    @Mock
    private java.io.Reader inputReader;

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

}