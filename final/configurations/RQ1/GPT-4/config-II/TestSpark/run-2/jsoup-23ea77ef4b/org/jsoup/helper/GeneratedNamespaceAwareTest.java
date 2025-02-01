package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom dom = new W3CDom();
        assertTrue(dom.namespaceAware());

        dom.namespaceAware(false);
        assertFalse(dom.namespaceAware());
    }

}