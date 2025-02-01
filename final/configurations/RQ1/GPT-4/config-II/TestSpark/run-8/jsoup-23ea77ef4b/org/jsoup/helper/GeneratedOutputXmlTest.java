package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedOutputXmlTest {

    @Test
    public void outputXmlTest() {
        HashMap<String, String> map = W3CDom.OutputXml();
        ;
        assertEquals("xml", map.get("method"));
    }

}