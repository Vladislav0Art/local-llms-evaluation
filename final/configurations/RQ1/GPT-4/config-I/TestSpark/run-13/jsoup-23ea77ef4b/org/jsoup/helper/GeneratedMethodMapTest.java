package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;

import javax.xml.xpath.XPath;
import java.util.HashMap;

public class GeneratedMethodMapTest {

    @Test
    public void methodMapTest() {
        HashMap<String, String> methodMap = W3CDom.methodMap("testMethod");
        assertEquals("testMethod", methodMap.get(OutputKeys.METHOD));
    }

}