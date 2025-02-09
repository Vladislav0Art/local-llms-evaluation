package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.NodeVisitor;
import org.jsoup.helper.W3CDom;

public class GeneratedOutputXml {

    @Test
    public void OutputXml() {
        HashMap<String, String> expected = new HashMap<>();
        expected.put("method", "xml");
        assertEquals(expected, W3CDom.OutputXml());
    }

}