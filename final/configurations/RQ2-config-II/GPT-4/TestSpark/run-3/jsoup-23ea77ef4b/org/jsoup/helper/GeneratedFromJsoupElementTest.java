package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() {
        Element input = new Document("input").body();
        W3CDom instance = new W3CDom();
        assertNotNull(instance.fromJsoup(input));
    }

}