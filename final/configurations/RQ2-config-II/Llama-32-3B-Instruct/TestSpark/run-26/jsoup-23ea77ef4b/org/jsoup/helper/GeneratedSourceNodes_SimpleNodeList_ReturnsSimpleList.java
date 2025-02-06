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
public class GeneratedSourceNodes_SimpleNodeList_ReturnsSimpleList {

    @Test
    public void sourceNodes_SimpleNodeList_ReturnsSimpleList() {
        NodeList nodeList = mock(NodeList.class);
        List<org.jsoup.nodes.Node> result = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);

        assertNotNull(result);
        assertTrue(result.size() == 0);
    }

}