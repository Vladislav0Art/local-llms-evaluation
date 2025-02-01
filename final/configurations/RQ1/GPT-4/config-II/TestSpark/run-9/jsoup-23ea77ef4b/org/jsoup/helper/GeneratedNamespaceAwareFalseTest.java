package org.jsoup.helper;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareFalseTest {

    @Test
    public void namespaceAwareFalseTest() {
        W3CDom w3CDom = new W3CDom();
        assertFalse(w3CDom.namespaceAware(false).namespaceAware());
    }

}