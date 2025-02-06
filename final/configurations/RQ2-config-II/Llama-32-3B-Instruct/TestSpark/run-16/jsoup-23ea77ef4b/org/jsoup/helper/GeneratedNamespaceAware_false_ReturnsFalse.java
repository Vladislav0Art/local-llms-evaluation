package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedNamespaceAware_false_ReturnsFalse {

    @Test
    public void namespaceAware_false_ReturnsFalse() {
        assertFalse(W3CDom.namespaceAware(false));
    }

}