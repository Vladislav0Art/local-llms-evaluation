package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() throws Exception {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document("");
        W3CDom w3CDom = new W3CDom();
        Document result = w3CDom.fromJsoup(in);
        assertNotNull(result);
    }

}