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

public class GeneratedTestSelectXpathWithElement {

    @Test
    public void testSelectXpathWithElement() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("org.jsoup.nodes.Document");
        Element element = document.getDocumentElement();
        Selector selector = element.select("*");
        NodeList nodeList = selector.findall("p");
        List<String> expectedTags = Arrays.asList("p", "span", "a", "img");
        assertEquals(expectedTags, nodeList.toArray(new String[0]));
    }

}