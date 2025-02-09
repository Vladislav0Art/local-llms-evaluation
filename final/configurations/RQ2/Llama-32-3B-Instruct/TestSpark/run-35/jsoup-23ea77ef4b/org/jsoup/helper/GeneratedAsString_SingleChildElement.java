package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedAsString_SingleChildElement {

    @Test
    public void asString_SingleChildElement() {
        org.jsoup.nodes.Document document = new org.jsoup.nodes.Document();
        Element child = document.createElement("child");
        document.appendChild(child);
        String result = W3CDom.asString(document);
        assertEquals("child", result);
    }

}