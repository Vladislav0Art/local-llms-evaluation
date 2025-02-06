package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNamespaceAwareSetToFalse {

    @Mock
    private Document document;

    @Mock
    private Properties properties;

    @Test
    public void namespaceAwareSetToFalse() {
        when(W3CDom.namespaceAware()).thenReturn(false);
        boolean result = W3CDom.namespaceAware();
        assertEquals(false, result);
    }

}