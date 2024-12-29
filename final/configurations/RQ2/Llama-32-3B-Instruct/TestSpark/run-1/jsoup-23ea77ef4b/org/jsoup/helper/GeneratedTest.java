package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

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

    @Test
    public void testOutputProperty() {
        // Create a document
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        // Add an element to the document
        Element root = doc.createElement("root");
        doc.appendChild(root);
        root.setTextContent("Root element");

        // Create a transformer
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        // Set the output property
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

        // Transform the document
        StringWriter writer = new StringWriter();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(writer);
        transformer.transform(source, result);

        assertEquals("Root element", writer.toString());
    }

    @Test
    public void testTransform() {
        // Create a document
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        // Add an element to the document
        Element root = doc.createElement("root");
        doc.appendChild(root);
        root.setTextContent("Root element");

        // Create a transformer
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        // Transform the document
        StringWriter writer = new StringWriter();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(writer);
        transformer.transform(source, result);

        assertEquals("Root element", writer.toString());
    }

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