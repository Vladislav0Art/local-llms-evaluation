package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSourceNodes_DocList_ReturnsNodeList {

    @Test
    public void sourceNodes_DocList_ReturnsNodeList() {
        Document in = Mockito.mock(Document.class);
        NodeList nodeList = Mockito.mock(NodeList.class);
        List<Node> expected = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            expected.add(Mockito.mock(Node.class));
        }
        when(in.getChildNodes()).thenReturn(nodeList);
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertEquals(expected, result);
    }

}