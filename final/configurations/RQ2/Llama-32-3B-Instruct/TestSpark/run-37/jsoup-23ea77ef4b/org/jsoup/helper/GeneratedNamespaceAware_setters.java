package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;
import static org.jsoup.nodes.Document.parse;
import static org.jsoup.nodes.DocumentBuilderFactory.newInstance;
import static org.jsoup.select.Selector.empty;
import static org.jsoup.select.Selector.select;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNamespaceAware_setters {

    @Mock
    private DocumentBuilderFactory factory;

    @Test
    public void namespaceAware_setters() {
        boolean result = W3CDom.namespaceAware(false);
        Mockito.when(factory.newInstance().newDocumentBuilder()).thenReturn(W3CDom.getImplementation());
        assertThat(result, isEmptyString());
    }

}