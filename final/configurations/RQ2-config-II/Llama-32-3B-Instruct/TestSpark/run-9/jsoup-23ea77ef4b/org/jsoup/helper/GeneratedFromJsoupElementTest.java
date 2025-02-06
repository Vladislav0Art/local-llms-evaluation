package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        Element element = new Element();
        Document convertedDoc = org.jsoup.helper.W3CDom.fromJsoup(element);
        assertNotNull(convertedDoc);
    }

}