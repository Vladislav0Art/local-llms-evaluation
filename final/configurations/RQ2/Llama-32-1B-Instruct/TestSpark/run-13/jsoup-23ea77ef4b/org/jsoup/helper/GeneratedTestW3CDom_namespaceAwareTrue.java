package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestW3CDom_namespaceAwareTrue {

    public static String namespaceAwareTrue() throws Exception {
        return factory.newDocumentBuilder().parse("path/to/input");
    }

    @Test
    public void testW3CDom_namespaceAwareTrue() throws Exception {
        Document inputDocument = namespaceAwareTrue();
        Element outputElement = new Element("test");
        org.jsoup.helper.W3CDom.convert(inputDocument, outputElement);
        assert !(outputElement.toString().equals(""));
    }

}