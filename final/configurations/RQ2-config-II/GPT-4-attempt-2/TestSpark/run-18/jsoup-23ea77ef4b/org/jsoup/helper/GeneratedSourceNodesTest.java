package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedSourceNodesTest {

    @Test
    public void sourceNodesTest() {
        W3CDom dom = new W3CDom();
        NodeList nodeList = Mockito.mock(NodeList.class);
        Mockito.when(nodeList.getLength()).thenReturn(2);
        List<Node> nodes = dom.sourceNodes(nodeList, Node.class);
        assertEquals(2, nodes.size());
    }

}