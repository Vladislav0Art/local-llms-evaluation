package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSelectXpathDoc {

    @Test
    public void selectXpathDoc() {
        Document doc = W3CDom.convert(new org.jsoup.nodes.Document());
        NodeList result = W3CDom.selectXpath("//div", doc);
        assertEquals(1, result.getLength());
    }

}