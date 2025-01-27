package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNamespaceAwareMethodSetsCorrectProperty {

    @Test
    public void namespaceAwareMethodSetsCorrectProperty() {
        W3CDom w3cdom = new W3CDom();
        boolean result = w3cdom.namespaceAware(true);
        assertEquals(true, w3cdom.namespaceAware());
    }

}