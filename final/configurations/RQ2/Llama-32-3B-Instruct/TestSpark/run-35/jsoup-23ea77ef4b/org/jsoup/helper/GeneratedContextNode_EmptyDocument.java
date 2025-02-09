package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedContextNode_EmptyDocument {

    @Test
    public void contextNode_EmptyDocument() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Node contextNode = W3CDom.contextNode(document);
        assertNotNull(contextNode);
    }

}