package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.BeforeEach;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSelectXpath.

SelectsNodesFromContextNode {

    @Mock
    private Document mockDocument;

    public void setUp () {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void selectXpath.SelectsNodesFromContextNode() throws XPathExpressionException {
        Node context = mockDocument.getDocumentElement();
        NodeList expected = context.getChildNodes();
        NodeList actual = (NodeList) W3CDom.selectXpath("/*", context);
        assertEquals(expected, actual);
    }

}