package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedConvertInputDocumentTest {

    @Test
    public void convertInputDocumentTest() {
        Document document = new Document(OutputKeys.METHOD);
        assertNotNull(W3CDom.convert(document));
    }

}