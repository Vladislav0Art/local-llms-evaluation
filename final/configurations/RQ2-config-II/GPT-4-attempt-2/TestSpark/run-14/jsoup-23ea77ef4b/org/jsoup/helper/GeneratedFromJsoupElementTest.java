package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        W3CDom w3cDom = new W3CDom();
        Element element = new Element();
        assertNotNull(w3cDom.fromJsoup(element));
    }

}