package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedNamespaceAware_testFalse {

    @Mock
    private DocumentBuilder documentBuilder;

    @Mock
    private Transformer transformer;

    @Test
    public void namespaceAware_testFalse() {
        when(documentBuilder.getImplementation()).thenReturn(Mockito.mock(DOMImplementation.class));
        assertFalse(new W3CDom().namespaceAware(false));
    }

}