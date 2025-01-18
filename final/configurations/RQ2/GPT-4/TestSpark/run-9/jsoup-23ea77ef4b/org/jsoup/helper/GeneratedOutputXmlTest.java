package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.Selector;
import org.junit.Test;
import org.w3c.dom.NodeList;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedOutputXmlTest {

    @Test
    public void outputXmlTest() {
        assertNotNull(W3CDom.OutputXml());
        assertTrue(W3CDom.OutputXml().size() > 0);
    }

}