package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        W3CDom testObj = new W3CDom();
        Element jsoupElement = new Element("");
        assertNotNull(testObj.fromJsoup(jsoupElement));
    }

}