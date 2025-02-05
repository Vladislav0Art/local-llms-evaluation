package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        W3CDom w3CDom = new W3CDom();
        NodeList nodeList = Mockito.mock(NodeList.class);
        List<Element> result = w3CDom.sourceNodes(nodeList, Element.class);
        Assert.assertNotNull(result);
    }

}