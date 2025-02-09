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
public class GeneratedSourceNodes_nodeList_testSuccess {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Test
    public void sourceNodes_nodeList_testSuccess() {
        NodeList nodeList = Mockito.mock(NodeList.class);
        List<Node> nodes = new ArrayList<>();
        when(nodeList.getLength()).thenReturn(nodes.size());
        assertEquals(nodes, new W3CDom().sourceNodes(nodeList, Node.class));
    }

}