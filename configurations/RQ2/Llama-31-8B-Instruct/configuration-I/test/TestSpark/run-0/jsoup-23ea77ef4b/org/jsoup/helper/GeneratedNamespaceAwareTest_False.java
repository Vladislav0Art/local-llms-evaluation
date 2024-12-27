package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeList;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.mockito.Mock;

import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;

public class GeneratedNamespaceAwareTest_False {

    @Test
    public void namespaceAwareTest_False() {
        W3CDom w3CDom = new W3CDom();
        boolean result = w3CDom.namespaceAware(false);
        assertFalse(result);
    }

}