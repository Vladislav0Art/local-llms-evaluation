package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedSelectXpath_xpath_testSuccess {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Test
    public void selectXpath_xpath_testSuccess() {
        String xpath = "test";
        Node contextNode = Mockito.mock(Node.class);
        NodeList nodeList = new ArrayList<>();
        when(contextNode.getNodeList(Mockito.any(String.class))).thenReturn(nodeList);
        assertEquals(nodeList, new W3CDom().selectXpath(xpath, contextNode));
    }

}