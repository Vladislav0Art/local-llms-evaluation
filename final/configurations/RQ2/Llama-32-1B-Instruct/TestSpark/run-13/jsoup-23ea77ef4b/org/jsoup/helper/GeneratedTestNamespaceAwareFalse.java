package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestNamespaceAwareFalse {

    public static String namespaceAwareTrue() throws Exception {
        return factory.newDocumentBuilder().parse("path/to/input");
    }

    @Test
    public void testNamespaceAwareFalse() throws Exception {
        String namespace = "http://www.w3.org/2001/XMLSchema";
        Document inputDocument = factory.newDocumentBuilder().parse("path/to/input");
        Element outputElement = new Element("test", namespace);
        org.jsoup.helper.W3CDom.convert(inputDocument, outputElement);
    }

    public static void assertCorrectFormat(String correctString) {
        String inputString = "";
        for (char c : correctString.toCharArray()) {
            if (!inputString.contains(String.valueOf(c))) {
                throw new RuntimeException("The string has missing character '" + c + "'");
            }
        }
    }

    public static Document parseXmlDocument(String xml) throws Exception {
        return factory.newDocumentBuilder().parse(xml);
    }

    public static void main(String[] args) throws Exception {
        assertCorrectFormat("<root><test>value</test></root>");
        assertCorrectFormat("test");

        String correctString = "<xml><root><test>value</test></root></xml>";
        Document parsedDocument = parseXmlDocument(correctString);
        assertCorrectFormat(parsedDocument.toString());
    }

}