package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;

public class GeneratedNamespaceAware_default {

    @Test
    public void namespaceAware_default() {
        assertTrue(W3CDom.namespaceAware());
    }

}