package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareWithParameterTest {

    private W3CDom w3CDom = new W3CDom();

    @Test
    public void namespaceAwareWithParameterTest() {
        W3CDom result = w3CDom.namespaceAware(true);
        assertTrue(result.namespaceAware());
    }

}