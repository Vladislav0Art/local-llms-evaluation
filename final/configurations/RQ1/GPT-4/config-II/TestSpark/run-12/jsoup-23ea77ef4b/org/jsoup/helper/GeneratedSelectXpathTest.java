package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.NodeList;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

public class GeneratedSelectXpathTest {

    @Test
    public void selectXpathTest() {
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document contextNode = Mockito.mock(org.w3c.dom.Document.class);
        NodeList nodeList = w3CDom.selectXpath("/tag", contextNode);
        assert nodeList != null;
    }

}