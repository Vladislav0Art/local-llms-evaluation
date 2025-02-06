package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;

public class GeneratedSelectXpath_doc {

    @Test
    public void selectXpath_doc() {
        NodeList nodeList = new ArrayList<>();
        nodeList.add(new Element("element"));
        NodeList expected = new ArrayList<>();
        expected.add(nodeList.get(0));
        assertEquals(expected, W3CDom.selectXpath("//element", new Document()));
    }

}