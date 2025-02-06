package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedNamespaceAwareTrueTest {

    @Test
    public void namespaceAwareTrueTest() {
        assertTrue(W3CDom.namespaceAware());
    }

}