package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        W3CDom instance = new W3CDom();
        Element element = new Element("p");
        Document result = instance.fromJsoup(element);
        assertNotNull(result);
    }

}