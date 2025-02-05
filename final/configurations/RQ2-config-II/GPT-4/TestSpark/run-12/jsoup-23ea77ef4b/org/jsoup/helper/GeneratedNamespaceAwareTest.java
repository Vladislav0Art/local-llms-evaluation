package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareTest {

    W3CDom w3cDom = new W3CDom();

    @Test
    public void namespaceAwareTest() {
        boolean returnValue = w3cDom.namespaceAware();
        assertFalse(returnValue);

        W3CDom returnedDom = w3cDom.namespaceAware(true);
        assertNotNull(returnedDom);
        assertTrue(returnedDom.namespaceAware());
    }

}