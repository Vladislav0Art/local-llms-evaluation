package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromXpathSelectsNodesFromDoc {

    @Mock
    private Node contextNodeMock;

    @Mock
    private Document documentMock;

    @Test
    public void fromXpathSelectsNodesFromDoc() {
        NodeList nodeListMock = mock(NodeList.class);
        when(nodeListMock.getLength()).thenReturn(1);
        Document expectedDoc = documentMock;
        when(W3CDom.selectXpath(anyString(), any(Document.class))).thenReturn(nodeListMock);
        NodeList actualNodeList = W3CDom.selectXpath("xpath", documentMock);
        assertEquals(expectedDoc, actualNodeList.getContextNode());
    }

}