package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom dom = new W3CDom();
        assertTrue(dom.namespaceAware());

        dom.namespaceAware(false);
        assertFalse(dom.namespaceAware());

        dom.namespaceAware(true);
        assertTrue(dom.namespaceAware());
    }

}