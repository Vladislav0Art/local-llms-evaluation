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
public class GeneratedSelectXpathDocumentTest {

    @Mock
    private Document document;

    @Mock
    private Element element;

    public static final String XML = "<html><body>Hello World!</body></html>";

    public static final String HTML = "<html><body>Hello World!</body></html>";

    @Test
    public void selectXpathDocumentTest() {
        NodeList result = W3CDom.selectXpath("//body", document);
        Mockito.when(document.getTagName()).thenReturn("html");
        Mockito.when(document.getElementsByTagName("body")).thenReturn(new ArrayList<>());
        org.junit.Assert.assertSame(result, null);
    }

}