package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() {
        Document documentMock = Mockito.mock(Document.class);
        assertNotNull(W3CDom.convert(documentMock));
    }

}