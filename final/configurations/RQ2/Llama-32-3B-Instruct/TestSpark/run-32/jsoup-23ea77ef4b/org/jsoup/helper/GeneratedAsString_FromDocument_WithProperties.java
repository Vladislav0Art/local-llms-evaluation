package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.W3CDom;

public class GeneratedAsString_FromDocument_WithProperties {

    @Test
    public void asString_FromDocument_WithProperties() throws Exception {
        Properties properties = new Properties();
        properties.put("property", "value");
        String expected = "<div property=\"value\">Hello</div>";
        Document inDoc = new Document();
        inDoc.appendChild(new Element("div").appendText("Hello"));
        assertEquals(expected, W3CDom.asString(inDoc, properties));
    }

}