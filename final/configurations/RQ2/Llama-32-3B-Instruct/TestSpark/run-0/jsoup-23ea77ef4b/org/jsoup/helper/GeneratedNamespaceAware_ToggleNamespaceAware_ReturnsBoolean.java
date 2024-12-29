package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.BeforeEach;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runner.MockitoJUnitRunner;

public class GeneratedNamespaceAware_ToggleNamespaceAware_ReturnsBoolean {

    @Mock
    private Document mockDocument;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void namespaceAware_ToggleNamespaceAware_ReturnsBoolean() {
        boolean result = W3CDom(namespaceAware(true));
        assertTrue(result);

        result = W3CDom(namespaceAware(false));
        assertFalse(result);
    }

}