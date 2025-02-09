package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        assertFalse(w3cDom.namespaceAware());
    }

}