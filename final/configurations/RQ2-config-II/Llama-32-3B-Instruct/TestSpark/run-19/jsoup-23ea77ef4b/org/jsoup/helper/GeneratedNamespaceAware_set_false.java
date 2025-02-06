package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;

public class GeneratedNamespaceAware_set_false {

    @Test
    public void namespaceAware_set_false() {
        W3CDom w3cdDom = new W3CDom();
        assertFalse(w3cdDom.namespaceAware(false));
    }

}