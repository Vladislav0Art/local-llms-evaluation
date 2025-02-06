package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedSourceNodes_nodeListNodeTypeReturnsCorrectList {

    @Test
    public void sourceNodes_nodeListNodeTypeReturnsCorrectList() {
        NodeList nodeList = Mockito.mock(NodeList.class);
        Class<T> nodeType = Mockito.mock(Class.class);
        List<?> expected = Mockito.mock(List.class);
        List<? extends org.jsoup.nodes.Node> result = W3CDom.sourceNodes(nodeList, nodeType);
        assertEquals(expected, result);
    }

}