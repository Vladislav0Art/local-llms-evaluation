package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedMethodMapTest {

    @Test
    public void methodMapTest() {
        HashMap<String, String> map = W3CDom.methodMap("html");
        assertEquals("html", map.get("method"));
    }

}