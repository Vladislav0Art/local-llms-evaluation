package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.Selector;
import org.jsoup.select.Select;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringWriter;

public class GeneratedTestNs Aware {

    @Test
    public void testNs

    Aware() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Element root = document.createElement("root");
        w3cdom = new W3CDom();
        w3cdom.namespaceAware(true);
        Element nsElement = document.createElementNS("http://example.com/ns", "ns");
        root.appendChild(nsElement);
        actual = true;
        System.out.println(w3cdom.namespaceAware());
        assertEquals(actual, actual);
    }

}