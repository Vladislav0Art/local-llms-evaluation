package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNamespaceAwareSetToTrue {

    @Test
    public void namespaceAwareSetToTrue() {
        boolean result = W3CDom.namespaceAware(true);
        assertTrue(result);
    }

}