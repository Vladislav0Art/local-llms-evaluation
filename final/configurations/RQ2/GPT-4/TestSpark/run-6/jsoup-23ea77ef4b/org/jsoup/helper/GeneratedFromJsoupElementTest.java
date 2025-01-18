package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        Element element = new Element("test");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document result = w3CDom.fromJsoup(element);
        Assert.assertNotNull(result);
    }

}