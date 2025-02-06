package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedNamespaceAwareFalseTest {

    @Test
    public void namespaceAwareFalseTest() {
        assertFalse(W3CDom.namespaceAware(false));
    }

}