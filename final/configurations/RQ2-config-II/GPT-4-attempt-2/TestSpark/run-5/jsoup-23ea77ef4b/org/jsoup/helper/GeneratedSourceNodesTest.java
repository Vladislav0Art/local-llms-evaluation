package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        W3CDom dom = new W3CDom();
        NodeList nodeList = Mockito.mock(NodeList.class);
        when(nodeList.getLength()).thenReturn(5);

        List<org.jsoup.nodes.Node> resultNodes = dom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertEquals(5, resultNodes.size());
    }

}