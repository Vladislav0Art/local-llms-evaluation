package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.W3CDom;
import org.w3c.dom.NodeList;

import java.util.List;
import java.util.HashMap;

import org.jsoup.Jsoup;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        W3CDom w3cDom = new W3CDom();
        Element element = new Element("p");
        assertNotNull(w3cDom.fromJsoup(element));
    }

}