package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNamespaceAwareDefaultIsFalse {

    @Test
    public void namespaceAwareDefaultIsFalse() {
        boolean result = W3CDom.namespaceAware();
        assertTrue(result == false);
    }

}