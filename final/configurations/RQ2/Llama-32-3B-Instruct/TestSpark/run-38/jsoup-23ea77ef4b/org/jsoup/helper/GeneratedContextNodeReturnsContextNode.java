package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedContextNodeReturnsContextNode {

    @Mock
    private Node contextNodeMock;

    @Mock
    private Document documentMock;

    @Test
    public void contextNodeReturnsContextNode() {
        Document expectedDoc = documentMock;
        when(documentMock.getContextNode()).thenReturn(contextNodeMock);
        Node actualNode = W3CDom.contextNode(documentMock);
        assertTrue(actualNode.equals(contextNodeMock));
    }

}