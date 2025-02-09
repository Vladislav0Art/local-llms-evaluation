package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNamespaceAware ReturnsFalse {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private DocumentFactory documentFactory;

    @Mock
    private Transformer transformer;

    @Test
    public void namespaceAware

    ReturnsFalse() {
        boolean result = W3CDom.namespaceAware();
        org.junit.Assert.assertFalse(result);
    }

}