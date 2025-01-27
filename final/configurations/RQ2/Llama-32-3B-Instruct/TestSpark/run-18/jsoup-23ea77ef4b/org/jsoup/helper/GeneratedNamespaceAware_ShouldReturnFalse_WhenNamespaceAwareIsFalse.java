package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNamespaceAware_ShouldReturnFalse_WhenNamespaceAwareIsFalse {

    @Mock
    private Document document;

    @Mock
    private Element element;

    @InjectMocks
    private W3CDom w3cDom;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void namespaceAware_ShouldReturnFalse_WhenNamespaceAwareIsFalse() {
        when(w3cDom.namespaceAware()).thenReturn(false);
        boolean result = w3cDom.namespaceAware();
        assertEquals(false, result);
    }

}