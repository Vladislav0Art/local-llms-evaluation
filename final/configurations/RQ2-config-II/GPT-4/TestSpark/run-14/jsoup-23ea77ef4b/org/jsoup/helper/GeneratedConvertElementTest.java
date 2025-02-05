package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class GeneratedConvertElementTest {

    @Test
    public void convertElementTest() {
        Document document = Document.createShell("");
        Element element = document.appendElement("test");
        W3CDom w3CDom = new W3CDom();
        Document out = w3CDom.fromJsoup(element);
        Assert.assertEquals(element.toString(), out.get.toString());
    }

}