package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedFromJsoupElementTest {

    @Test
    public void FromJsoupElementTest() {
        W3CDom w3cDom = new W3CDom();
        Element element = new Element("p");
        org.w3c.dom.Document result = w3cDom.fromJsoup(element);
        assertNotNull(result);
    }

}