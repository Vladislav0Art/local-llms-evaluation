package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedNamespaceAware_setToTrue {

    @Test
    public void namespaceAware_setToTrue() {
        assertFalse(W3CDom.namespaceAware(false));
        assertTrue(W3CDom.namespaceAware(true));
    }

}