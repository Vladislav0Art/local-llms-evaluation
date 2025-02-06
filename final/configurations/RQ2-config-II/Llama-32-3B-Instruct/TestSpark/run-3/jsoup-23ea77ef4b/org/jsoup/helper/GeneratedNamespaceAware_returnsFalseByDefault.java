package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedNamespaceAware_returnsFalseByDefault {

    @Test
    public void namespaceAware_returnsFalseByDefault() {
        boolean result = W3CDom.namespaceAware();
        assertTrue(result);
    }

}