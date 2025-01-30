package org.jsoup.helper;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedConvertFromDocumentTest {

    @Test
    public void convertFromDocumentTest() {
        org.jsoup.nodes.Element elementMock = mock(org.jsoup.nodes.Element.class);
        org.jsoup.nodes.Document documentMock = mock(org.jsoup.nodes.Document.class);
        when(documentMock.child(0)).thenReturn(elementMock);
        W3CDom w3CDom = new W3CDom();
        w3CDom.convert(documentMock, null);
        verify(documentMock, atLeastOnce()).child(0);
    }

}