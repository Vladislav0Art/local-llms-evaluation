package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class GeneratedConvertElementToSpecificDocumentTest {

    @Test
    public void convertElementToSpecificDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document("");
        Document w3cDoc = W3CDom.convert(jsoupDoc);
        Element jsoupElement = new Element(Tag.valueOf("p"), "");
        w3cDom.convert(jsoupElement, w3cDoc);
        Assert.assertTrue(w3cDoc.hasChildNodes());
    }

}