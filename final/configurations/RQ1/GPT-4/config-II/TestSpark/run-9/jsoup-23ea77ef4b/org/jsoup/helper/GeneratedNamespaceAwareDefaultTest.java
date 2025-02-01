package org.jsoup.helper;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareDefaultTest {

    @Test
    public void namespaceAwareDefaultTest() {
        W3CDom w3CDom = new W3CDom();
        assertTrue(w3CDom.namespaceAware());
    }

}