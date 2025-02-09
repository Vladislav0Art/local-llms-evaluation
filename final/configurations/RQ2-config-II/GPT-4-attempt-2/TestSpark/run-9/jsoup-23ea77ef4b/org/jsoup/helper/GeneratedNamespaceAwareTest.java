package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom instance = new W3CDom();
        boolean expected = true;
        instance.namespaceAware(expected);
        boolean result = instance.namespaceAware();
        assertEquals(expected, result);
    }

}