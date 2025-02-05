package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedSelectXpathStringNodeParamsTest {

    @Test
    public void selectXpathStringNodeParamsTest() {
        W3CDom w3CDom = new W3CDom();
        Node mockNode = mock(Node.class);
        assertTrue(w3CDom.selectXpath("//div", mockNode) instanceof NodeList);
    }

}