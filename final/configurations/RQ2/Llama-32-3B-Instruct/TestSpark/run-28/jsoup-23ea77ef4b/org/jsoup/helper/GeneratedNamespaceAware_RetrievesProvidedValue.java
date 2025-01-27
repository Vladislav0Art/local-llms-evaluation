package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedNamespaceAware_RetrievesProvidedValue {

    @Test
    public void namespaceAware_RetrievesProvidedValue() {
        boolean test = false;
        W3CDom w3cdDom = new W3CDom();
        w3cdDom.namespaceAware(test);
        assertEquals(true, w3cdDom.namespaceAware());
    }

}