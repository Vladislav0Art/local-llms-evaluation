package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestContextNode {

    @Test
    public void testContextNode() {
        // Create a document
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        // Add an element to the document
        Element root = doc.createElement("root");
        doc.appendChild(root);
        root.setTextContent("Root element");

        // Get the context node
        Node contextNode = W3CDom.contextNode(doc);

        assertEquals(root, contextNode);
    }

}