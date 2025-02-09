package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.DOMImplementation;

import static org.junit.Assert.*;

public class GeneratedNamespaceAware_AfterSettingToTrue_ReturnsTrue {

    @Test
    public void namespaceAware_AfterSettingToTrue_ReturnsTrue() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(true);
        assertTrue(w3cDom.namespaceAware());
    }

}