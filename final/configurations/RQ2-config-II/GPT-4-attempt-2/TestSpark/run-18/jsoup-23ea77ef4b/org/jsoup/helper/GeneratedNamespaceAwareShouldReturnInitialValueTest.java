package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareShouldReturnInitialValueTest {

    @Test
    public void namespaceAwareShouldReturnInitialValueTest() {
        W3CDom dom = new W3CDom();
        boolean namespaceAware = dom.namespaceAware();
        assertFalse(namespaceAware);
    }

}