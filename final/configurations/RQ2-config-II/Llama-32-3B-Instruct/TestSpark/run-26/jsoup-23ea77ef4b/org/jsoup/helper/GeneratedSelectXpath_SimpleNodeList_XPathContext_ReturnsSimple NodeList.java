package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.Selector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedSelectXpath_SimpleNodeList_XPathContext_ReturnsSimple NodeList {

    @Test
    public void selectXpath_SimpleNodeList_XPathContext_ReturnsSimple

    NodeList() {
        Node contextNode = mock(Node.class);
        NodeList nodeList = mock(NodeList.class);
        NodeList result = W3CDom.selectXpath("xpath", nodeList, contextNode);

        assertNotNull(result);
        assertTrue(result.size() == 0);
    }

}