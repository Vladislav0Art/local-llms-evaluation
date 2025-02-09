package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNamespaceAwareWithArgumentTest {

    @Test
    public void namespaceAwareWithArgumentTest() {
        W3CDom w3cDom = new W3CDom();
        boolean result = w3cDom.namespaceAware(true);

        assertTrue(result);
    }

}