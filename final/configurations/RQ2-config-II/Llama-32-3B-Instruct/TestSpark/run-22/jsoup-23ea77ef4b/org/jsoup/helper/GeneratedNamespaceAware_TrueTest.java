package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedNamespaceAware_TrueTest {

    @Test
    public void namespaceAware_TrueTest() {
        boolean result = W3CDom.namespaceAware();
        assertTrue(result);
    }

}