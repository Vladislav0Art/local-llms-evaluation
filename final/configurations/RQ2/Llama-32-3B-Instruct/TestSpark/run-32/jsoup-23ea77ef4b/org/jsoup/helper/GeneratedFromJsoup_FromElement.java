package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.W3CDom;

public class GeneratedFromJsoup_FromElement {

    @Test
    public void fromJsoup_FromElement() throws Exception {
        Element inElement = new Element("div").appendText("Hello");
        Document outDoc = W3CDom.fromJsoup(inElement);
        assertNotNull(outDoc);
    }

}