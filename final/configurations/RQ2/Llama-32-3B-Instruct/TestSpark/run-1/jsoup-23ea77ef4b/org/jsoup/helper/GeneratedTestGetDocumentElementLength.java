package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetDocumentElementLength {

    @Test
    public void testGetDocumentElementLength() {
        // Create a document
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        // Add an element to the document
        Element root = doc.createElement("root");
        doc.appendChild(root);
        root.setTextContent("Root element");

        // Get the length of the child nodes
        int childNodesLength = doc.getDocumentElement().getChildNodes().getLength();

        assertEquals(1, childNodesLength);
    }

    public static class W3CDom {

        public static Node contextNode(Document document) {
            return document.getDocumentElement();
        }
    }

}