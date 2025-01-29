package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.Selector;
import org.w3c.domComment;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedFromJsoup {

    @Test
    public void fromJsoup() {
        org.jsoup.nodes.Document document = new Document();
        org.jsoup.helper.W3CDom w3cdom = new W3CDom();
        assert w3cdom.fromJsoup(document);
    }

}