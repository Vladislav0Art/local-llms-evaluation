package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector;

public class GeneratedTest {

    public static String toString(W3CDom w3cdom) {
        return w3cdom.toString();
    }

    @Test
    public void testNamespaceAware() {
        W3CDom w3cdom = new W3CDom();
        boolean actual = w3cdom.namespaceAware();
        assertEquals(true, actual);
    }

    @Test
    public void testNamespaceAwareWithBoolean() {
        W3CDom w3cdom = new W3CDom();
        int expected = 1;
        int actual = w3cdom.namespaceAware(2);
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertJsoupToW3CDom() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("org.jsoup.nodes.Document");
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup(document);
        System.out.println(toString(w3cdom));
    }

    @Test
    public void testOutputHtml() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Element root = document.createElement("root");
        root.setAttribute("data-name", "root");
        root.appendChild(document.importNode(document.getDocumentElement(), true));
        W3CDom w3cdom = new W3CDom();
        w3cdom.OutputHtml(root);
        System.out.println(toString(w3cdom));
    }

    @Test
    public void testOutputXml() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.createDocument(null, "http://example.com/xsd/example.xsd", null);
        Element root = document.createElement("root");
        W3CDom w3cdom = new W3CDom();
        w3cdom.OutputXml(root);
        System.out.println(toString(w3cdom));
    }

    @Test
    public void testFromJsoup() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("org.jsoup.nodes.Document");
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup(document);
        System.out.println(toString(w3cdom));
    }

    @Test
    public void testFromJsoupWithElement() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Element element = builder.createElement("element");
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup(element);
        System.out.println(toString(w3cdom));
    }

    @Test
    public void testContextNode() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Element root = document.createElement("root");
        W3CDom w3cdom = new W3CDom();
        w3cdom.contextNode(document, root);
        System.out.println(toString(w3cdom));
    }

    @Test
    public void testNsAware() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Element root = document.createElement("root");
        w3cdom = new W3CDom();
        w3cdom.namespaceAware(true);
        Element nsElement = document.createElementNS("http://example.com/ns", "ns");
        root.appendChild(nsElement);
        System.out.println(toString(w3cdom));
    }

    public static void main(String[] args) {
        TestSparkTest sparkTest = new TestSparkTest();
        sparkTest.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sparkTest.stop();
    }

    private static class TestSparkTest extends SparkTest {

        @Override
        public void run(String[] args) {
            // test class
        }
    }

}