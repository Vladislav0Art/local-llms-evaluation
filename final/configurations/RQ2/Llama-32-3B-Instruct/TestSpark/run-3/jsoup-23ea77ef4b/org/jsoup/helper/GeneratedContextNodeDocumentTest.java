package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedContextNodeDocumentTest {

    @Mock
    private Document document;

    @Mock
    private Element element;

    public static final String XML = "<html><body>Hello World!</body></html>";

    public static final String HTML = "<html><body>Hello World!</body></html>";

    @Test
    public void contextNodeDocumentTest() {
        Document wDoc = W3CDom.contextNode(document);
        Mockito.when(document.getDocumentElement()).thenReturn(element);
        org.junit.Assert.assertEquals(wDoc.getDocumentElement(), element);
    }

}