package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNamespaceAwareReturnsTrue {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Mock
    private DocumentBuilderFactory documentFactory;

    @Test
    public void namespaceAwareReturnsTrue() {
        boolean result = org.jsoup.helper.W3CDom.namespaceAware();
        Mockito.when(documentBuilder.getParser()).thenReturn(transformer);
        Mockito.when(transformer.getClass()).thenReturn(Document.class);
        Mockito.when(documentFactory.newDocumentBuilder()).thenReturn(documentBuilder);
        Mockito.when(documentBuilder.getNamespaceAware()).thenReturn(true);
        assertEquals(true, result);
    }

}