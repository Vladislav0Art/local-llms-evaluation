package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeList;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareWithParamTest {

    @Test
    public void namespaceAwareWithParamTest() {
        W3CDom w3CDom = new W3CDom();
        W3CDom result = w3CDom.namespaceAware(true);
        assertTrue(result.namespaceAware());
    }

}