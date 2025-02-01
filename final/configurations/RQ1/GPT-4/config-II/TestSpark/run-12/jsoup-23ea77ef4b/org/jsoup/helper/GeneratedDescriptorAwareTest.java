package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.NodeList;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

public class GeneratedDescriptorAwareTest {

    @Test
    public void descriptorAwareTest() {
        W3CDom w3CDom = new W3CDom();
        assert w3CDom.namespaceAware();
    }

}