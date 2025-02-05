package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedAsStringDocumentParamTest {

    @Test
    public void asStringDocumentParamTest() {
        W3CDom w3CDom = new W3CDom();
        Document document = mock(Document.class);
        assertTrue(w3CDom.asString(document) instanceof String);
    }

}