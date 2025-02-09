package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedSelectXpathTest {

    @Test
    public void selectXpathTest() {
        org.w3c.dom.Document doc = mock(org.w3c.dom.Document.class);
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = mock(NodeList.class);
        when(w3cDom.selectXpath(anyString(), anyObject())).thenReturn(nodeList);
        NodeList result = w3cDom.selectXpath("//*", doc);
        Assert.assertNotNull(result);
    }

}