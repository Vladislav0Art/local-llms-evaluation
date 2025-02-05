package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        Element element = new Element("div");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document result = w3CDom.fromJsoup(element);
        assertNotNull(result);
    }

}