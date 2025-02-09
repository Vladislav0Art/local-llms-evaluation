package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedNamespaceAware_WillReturnFalseWhenPassedFalse {

    @Test
    public void namespaceAware_WillReturnFalseWhenPassedFalse() {
        boolean result = new W3CDom().namespaceAware(false);
        assertFalse(result);
    }

}