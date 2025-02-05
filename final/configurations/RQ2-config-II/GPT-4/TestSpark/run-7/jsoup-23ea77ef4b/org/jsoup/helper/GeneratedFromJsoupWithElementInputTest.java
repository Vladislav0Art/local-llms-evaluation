package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedFromJsoupWithElementInputTest {

    @Test
    public void fromJsoupWithElementInputTest() {
        Element element = new Element(Tag.valueOf("p"), "");
        W3CDom w3CDom = new W3CDom();
        assertNotNull(w3CDom.fromJsoup(element));
    }

}