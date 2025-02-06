package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        Element domElem = doc().element();
        Document wDoc = W3CDom.fromJsoup(domElem);
        assertNotNull(wDoc);
    }

}