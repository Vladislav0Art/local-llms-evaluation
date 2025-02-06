package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNamespaceAware_emptyReturnsFalse {

    @Mock
    private DocumentBuilderFactory factory;

    public W3CDomTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void namespaceAware_emptyReturnsFalse() {
        boolean result = new W3CDom().namespaceAware();
        assertTrue(result);
    }

}