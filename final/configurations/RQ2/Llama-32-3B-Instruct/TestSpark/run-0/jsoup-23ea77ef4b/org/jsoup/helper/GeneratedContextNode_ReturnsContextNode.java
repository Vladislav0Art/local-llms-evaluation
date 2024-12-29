package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.BeforeEach;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runner.MockitoJUnitRunner;

public class GeneratedContextNode_ReturnsContextNode {

    @Mock
    private Document mockDocument;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void contextNode_ReturnsContextNode() {
        Node expected = mockDocument.getDocumentElement();
        Node actual = W3CDom.contextNode(mockDocument);
        assertEquals(expected, actual);
    }

}