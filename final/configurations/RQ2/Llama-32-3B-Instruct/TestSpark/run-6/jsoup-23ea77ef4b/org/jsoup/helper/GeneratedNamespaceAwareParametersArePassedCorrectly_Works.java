package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedNamespaceAwareParametersArePassedCorrectly_Works {

    @Test
    public void namespaceAwareParametersArePassedCorrectly_Works() {
        W3CDom w3cd = new W3CDom();
        assertTrue(w3cd.namespaceAware(true));
    }

}