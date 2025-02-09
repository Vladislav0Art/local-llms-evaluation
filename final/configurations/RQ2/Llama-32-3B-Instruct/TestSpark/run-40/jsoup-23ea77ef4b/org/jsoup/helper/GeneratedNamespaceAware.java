package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.jsoup.nodes.Document.parse;
import static org.jsoup.nodes.Element.tagName;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNamespaceAware {

    @Mock
    private DocumentBuilderFactory documentBuilderFactory;

    @Mock
    private DocumentBuilder documentBuilder;

    @Test
    public void namespaceAware() {
        boolean expectedNamespaceAware = false;
        W3CDom w3cDom = new W3CDom();
        boolean result = w3cDom.namespaceAware();
        assertThat(result, is(expectedNamespaceAware));
    }

}