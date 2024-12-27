package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNamespaceAware_WasNamespaceAware {

    @Test
    public void namespaceAware_WasNamespaceAware() {
        boolean wasNamespaceAware = true;
        boolean result = new W3CDom(wasNamespaceAware).namespaceAware();
        assert result == wasNamespaceAware;
    }

}