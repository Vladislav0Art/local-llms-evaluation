package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class GeneratedConvertElementTest {

    @Test
    public void convertElementTest() {
        W3CDom w3cDom = new W3CDom();
        Element element = Mockito.mock(Element.class);
        org.w3c.dom.Document document = Mockito.mock(org.w3c.dom.Document.class);
        w3cDom.convert(element, document);
        // The method does not return a value
    }

}