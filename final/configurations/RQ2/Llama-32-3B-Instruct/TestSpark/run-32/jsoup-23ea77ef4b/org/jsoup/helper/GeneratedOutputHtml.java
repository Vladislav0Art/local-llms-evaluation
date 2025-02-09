package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.W3CDom;

public class GeneratedOutputHtml {

    @Test
    public void OutputHtml() {
        HashMap<String, String> expected = new HashMap<>();
        expected.put("method", "html");
        assertEquals(expected, W3CDom.OutputHtml());
    }

}