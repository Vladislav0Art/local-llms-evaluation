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

public class GeneratedAsStringWithPropertiesTest {

    @Test
    public void asStringWithPropertiesTest() {
        org.jsoup.nodes.Document document = Jsoup.parse("<html></html>");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(document);
        assertNotNull(W3CDom.asString(w3cDoc, W3CDom.OutputHtml()));
    }

}