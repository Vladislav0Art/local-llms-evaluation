package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedConvertDocumentTest {

    @Test
    public void convertDocumentTest() throws Exception {
        Document document = Mockito.mock(Document.class);
        org.w3c.dom.Document converted = W3CDom.convert(document);
        assertNotNull(converted);
    }

}