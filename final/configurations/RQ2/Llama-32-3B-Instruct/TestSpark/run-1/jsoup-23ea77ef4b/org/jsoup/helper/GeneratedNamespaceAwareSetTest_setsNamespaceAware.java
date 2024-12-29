package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class GeneratedNamespaceAwareSetTest_setsNamespaceAware {

    @Test
    public void namespaceAwareSetTest_setsNamespaceAware() {
        boolean namespaceAware = true;
        W3CDom w3cdom = new W3CDom();
        w3cdom.namespaceAware(namespaceAware);
        assertTrue(w3cdom.namespaceAware());
    }

}