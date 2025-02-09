package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNamespaceAwareTest_falseReturnsFalse {

    @Test
    public void namespaceAwareTest_falseReturnsFalse() {
        assertFalse(W3CDom.namespaceAware(false));
    }

}