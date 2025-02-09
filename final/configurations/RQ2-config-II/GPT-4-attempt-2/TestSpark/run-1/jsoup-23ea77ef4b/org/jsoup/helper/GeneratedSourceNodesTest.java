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

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = Mockito.mock(NodeList.class);
        List<Element> result = w3cDom.sourceNodes(nodeList, Element.class);
        Assert.assertNotNull(result);
    }

}