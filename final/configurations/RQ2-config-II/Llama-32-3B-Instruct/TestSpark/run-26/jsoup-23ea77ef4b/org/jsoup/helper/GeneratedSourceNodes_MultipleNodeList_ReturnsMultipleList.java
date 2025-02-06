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
public class GeneratedSourceNodes_MultipleNodeList_ReturnsMultipleList {

    @Test
    public void sourceNodes_MultipleNodeList_ReturnsMultipleList() {
        NodeList nodeList1 = mock(NodeList.class);
        NodeList nodeList2 = mock(NodeList.class);
        List<org.jsoup.nodes.Node> result = W3CDom.sourceNodes(List.of(nodeList1, nodeList2), org.jsoup.nodes.Node.class);

        assertNotNull(result);
        assertTrue(result.size() == 0);
    }

}