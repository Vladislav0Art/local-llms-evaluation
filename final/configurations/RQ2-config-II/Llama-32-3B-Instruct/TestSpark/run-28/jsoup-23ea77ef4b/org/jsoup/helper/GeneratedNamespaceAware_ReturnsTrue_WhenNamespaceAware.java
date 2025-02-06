package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNamespaceAware_ReturnsTrue_WhenNamespaceAware {

    @Mock
    private Document doc;

    @Test
    public void namespaceAware_ReturnsTrue_WhenNamespaceAware() {
        boolean result = W3CDom.namespaceAware();
        assertTrue(result);
    }

}