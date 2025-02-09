package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareCurrentStateTest {

    @Test
    public void NamespaceAwareCurrentStateTest() {
        W3CDom w3cDom = new W3CDom();
        assertNotNull(w3cDom.namespaceAware());
    }

}