package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertElementTest {

    @Test
    public void convertElementTest() {
        Element element = new Element("test");
        W3CDom w3CDom = new W3CDom();
        w3CDom.convert(element);
    }

}