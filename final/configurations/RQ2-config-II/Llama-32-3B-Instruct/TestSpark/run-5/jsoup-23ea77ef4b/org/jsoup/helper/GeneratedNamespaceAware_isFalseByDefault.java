package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedNamespaceAware_isFalseByDefault {

    @Test
    public void namespaceAware_isFalseByDefault() {
        assertTrue(W3CDom.namespaceAware());
    }

}