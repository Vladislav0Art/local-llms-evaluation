package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedNamespaceAware_False_ReturnsFalse {

    @Test
    public void namespaceAware_False_ReturnsFalse() {
        assertFalse(W3CDom.namespaceAware(false));
    }

}