package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.BeforeEach;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runner.MockitoJUnitRunner;

public class GeneratedSelectXpathSelectsNodesFromContextNode {

    @Mock
    private Document mockDocument;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void selectXpathSelectsNodesFromContextNode() throws XPathExpressionException {
        Node context = mockDocument.getDocumentElement();
        NodeList expected = context.getChildNodes();
        NodeList actual = (NodeList) W3CDom.selectXpath("/*", context);
        assertEquals(expected, actual);
    }

}