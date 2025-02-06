package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedSourceNodes_nodeList_isEmpty {

    @Test
    public void sourceNodes_nodeList_isEmpty() {
        NodeList nodeList = Mockito.mock(NodeList.class);
        List<org.jsoup.nodes.Node> nodes = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertTrue(nodes.isEmpty());
    }

}