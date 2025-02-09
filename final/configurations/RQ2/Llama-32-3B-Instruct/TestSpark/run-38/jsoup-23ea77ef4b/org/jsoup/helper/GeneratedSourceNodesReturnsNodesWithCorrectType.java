package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSourceNodesReturnsNodesWithCorrectType {

    @Mock
    private Node contextNodeMock;

    @Mock
    private Document documentMock;

    @Test
    public void sourceNodesReturnsNodesWithCorrectType() {
        List<Node> nodeListMock = mock(List.class);
        when(nodeListMock.size()).thenReturn(1);
        Node expectedNode = contextNodeMock;
        when(W3CDom.sourceNodes(any(NodeList.class), any(Class.class))).thenReturn(nodeListMock);
        List<Node> actualNodeList = W3CDom.sourceNodes(nodeListMock, Node.class);
        assertEquals(expectedNode, actualNodeList.get(0));
    }

}