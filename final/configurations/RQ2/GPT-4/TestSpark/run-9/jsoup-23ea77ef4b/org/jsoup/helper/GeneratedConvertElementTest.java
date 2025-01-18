package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertElementTest {

    @Test
    public void convertElementTest() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element("");
        org.w3c.dom.Document out =
                javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        new W3CDom().convert(in, out);
        assertNotNull(out.getDocumentElement());
    }

}