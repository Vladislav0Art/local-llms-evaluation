package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector;

public class GeneratedTestNsAware {

    public static String toString(W3CDom w3cdom) {
        return w3cdom.toString();
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