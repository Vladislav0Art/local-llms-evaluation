package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedSelectXpath_xpathNodeContextReturnsCorrectNodeList {

    @Test
    public void selectXpath_xpathNodeContextReturnsCorrectNodeList() {
        String xpath = Mockito.mock(String.class);
        Node contextNode = Mockito.mock(Node.class);
        NodeList expected = Mockito.mock(NodeList.class);
        NodeList result = W3CDom.selectXpath(xpath, contextNode);
        assertEquals(expected, result);
    }

}