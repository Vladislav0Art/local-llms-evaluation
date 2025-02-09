package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        NodeList nodeListMock = Mockito.mock(NodeList.class);
        W3CDom w3CDom = new W3CDom();
        List<org.jsoup.nodes.Node> nodes = w3CDom.sourceNodes(nodeListMock, org.jsoup.nodes.Node.class);
        assertNotNull(nodes);
    }

}