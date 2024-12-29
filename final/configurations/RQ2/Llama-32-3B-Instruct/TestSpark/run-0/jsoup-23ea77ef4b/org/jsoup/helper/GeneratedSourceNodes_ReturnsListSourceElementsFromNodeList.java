package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.BeforeEach;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runner.MockitoJUnitRunner;

public class GeneratedSourceNodes_ReturnsListSourceElementsFromNodeList {

    @Mock
    private Document mockDocument;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void sourceNodes_ReturnsListSourceElementsFromNodeList() {
        NodeList expected = mockDocument.getDocumentElement().getChildNodes();
        List<org.jsoup.nodes.Node> actual = (List<org.jsoup.nodes.Node>) W3CDom.sourceNodes(mockDocument.getDocumentElement().getChildNodes(), org.jsoup.nodes.Node.class);
        assertEquals(expected, actual);
    }

}