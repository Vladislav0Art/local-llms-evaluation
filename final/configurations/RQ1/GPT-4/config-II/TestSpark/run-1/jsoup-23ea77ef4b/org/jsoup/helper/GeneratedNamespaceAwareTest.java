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

public class GeneratedNamespaceAwareTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        assertTrue(w3cDom.namespaceAware());

        W3CDom w3cDom2 = w3cDom.namespaceAware(false);
        assertFalse(w3cDom2.namespaceAware());
    }

}