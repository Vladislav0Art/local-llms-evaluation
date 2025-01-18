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

public class GeneratedConvertInAndOutTest {

    @Test
    public void convertInAndOutTest() {
        W3CDom dom = new W3CDom();
        org.jsoup.nodes.Document in = Jsoup.parse("<html></html>");
        org.w3c.dom.Document out = dom.fromJsoup(in);
        dom.convert(in, out);
        assertNotNull(out);
    }

}