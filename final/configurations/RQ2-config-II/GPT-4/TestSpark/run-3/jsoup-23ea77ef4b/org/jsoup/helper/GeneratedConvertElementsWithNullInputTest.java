package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedConvertElementsWithNullInputTest {

    @Test
    public void convertElementsWithNullInputTest() {
        Element input = null;
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        org.w3c.dom.Document output = builder.newDocument();

        W3CDom instance = new W3CDom();
        instance.convert(input, output);
    }

}