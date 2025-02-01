package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.transform.OutputKeys;
import java.util.HashMap;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class GeneratedMethodMapTest {

    @Test
    public void methodMapTest() {
        HashMap<String, String> result = W3CDom.methodMap("xml");
        assertTrue(result.get(OutputKeys.METHOD).equals("xml"));
    }

}