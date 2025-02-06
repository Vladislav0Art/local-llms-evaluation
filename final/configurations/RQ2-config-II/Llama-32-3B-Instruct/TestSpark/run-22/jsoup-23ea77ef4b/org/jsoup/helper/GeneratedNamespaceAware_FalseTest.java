package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedNamespaceAware_FalseTest {

    @Test
    public void namespaceAware_FalseTest() {
        boolean result = W3CDom.namespaceAware(false);
        assertFalse(result);
    }

}