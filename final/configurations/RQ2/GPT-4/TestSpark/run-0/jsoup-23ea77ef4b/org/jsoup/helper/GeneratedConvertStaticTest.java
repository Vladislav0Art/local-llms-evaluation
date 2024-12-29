package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertStaticTest {

    @Test
    public void convertStaticTest() {
        Document jsoupDoc = new Document("");
        org.w3c.dom.Document result = W3CDom.convert(jsoupDoc);
        assertNotNull(result);
    }

}