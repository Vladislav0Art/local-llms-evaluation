package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedNamespaceAwareSetTest {

    @Test
    public void namespaceAwareSetTest() {
        W3CDom dom = new W3CDom();
        dom.namespaceAware(true);
        assertTrue(dom.namespaceAware());
    }

}