package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.BeforeEach;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runner.MockitoJUnitRunner;

public class GeneratedSelectXpath_SelectsNodesFromDocument {

    @Mock
    private Document mockDocument;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void selectXpath_SelectsNodesFromDocument() throws XPathExpressionException {
        NodeList expected = mockDocument.getDocumentElement().getChildNodes();
        NodeList actual = (NodeList) W3CDom.selectXpath("/*", mockDocument);
        assertEquals(expected, actual);
    }

}