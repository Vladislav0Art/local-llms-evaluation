package org.jsoup.nodes;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class GeneratedTest {

    public static class OutputSettings {
        private boolean doctype;
        private boolean standalone;

        public OutputSettings(boolean doctype, boolean standalone) {
            this.doctype = doctype;
            this.standalone = standalone;
        }

        @Override
        public String toString() {
            return "doctype=" + doctype + ", standalone=" + standalone;
        }
    }

    public static void generateXmlDeclaration(String type) throws Exception {
        Document document = new Document();
        XmlDeclaration xmlDeclaration = new XmlDeclaration(type);
        // Add the XML declaration to the document
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(System.out);
        transformer.transform(source, result);
    }

    public static void generateOutputSettings() {
        Document.OutputSettings outputSettings = new Document.OutputSettings(true, true);
        System.out.println(outputSettings.toString());
    }
}

public class XmlDeclaration {
    private String type;

    public XmlDeclaration(String type) {
        this.type = type;
    }

    public void asXmlDeclaration() throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(this);
        StreamResult result = new StreamResult(System.out);
        transformer.transform(source, result);
    }
}

public class OutputSettingsTest {
    public static void main(String[] args) throws Exception {
        generateXmlDeclaration("1.0");
        Document.OutputSettings outputSettings = new Document.OutputSettings(true, true);
        System.out.println(outputSettings.toString());
    }

}