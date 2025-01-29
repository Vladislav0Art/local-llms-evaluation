package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedNamespaceAware_setters_sets_correct_value {

    private static Document doc;
    private static W3CDom w3cdom;

    @BeforeClass
    public static void init() {
        Properties properties = new Properties();
        // Set up mock properties here
        when(propertiesFromFile()).thenReturn(properties);
        doc = convert(doc, properties);
        w3cdom = new W3CDom();
    }

    @Test
    public void namespaceAware_setters_sets_correct_value() {
        W3CDOM_NAMESPACE_AWARE = false;
        w3cdom = new W3CDom();
        assertFalse(w3cdom.namespaceAware());
        assertNotEquals(false, w3cdom.namespaceAware());
    }

}