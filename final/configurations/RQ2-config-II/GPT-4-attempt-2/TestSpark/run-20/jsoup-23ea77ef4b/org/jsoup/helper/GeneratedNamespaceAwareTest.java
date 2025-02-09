package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Properties;

public class GeneratedNamespaceAwareTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        boolean namespaceAware = w3cDom.namespaceAware();
        assertEquals(false, namespaceAware);

        w3cDom = w3cDom.namespaceAware(true);
        namespaceAware = w3cDom.namespaceAware();
        assertEquals(true, namespaceAware);
    }

}