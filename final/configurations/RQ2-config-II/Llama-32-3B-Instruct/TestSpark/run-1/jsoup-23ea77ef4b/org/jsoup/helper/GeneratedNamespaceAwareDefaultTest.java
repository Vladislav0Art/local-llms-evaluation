package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNamespaceAwareDefaultTest {

    @Test
    public void namespaceAwareDefaultTest() {
        assertTrue(W3CDom.namespaceAware());
    }

}