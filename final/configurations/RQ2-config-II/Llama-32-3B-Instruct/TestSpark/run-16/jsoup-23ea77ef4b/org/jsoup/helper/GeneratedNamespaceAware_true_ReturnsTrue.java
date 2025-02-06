package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedNamespaceAware_true_ReturnsTrue {

    @Test
    public void namespaceAware_true_ReturnsTrue() {
        assertTrue(W3CDom.namespaceAware());
    }

}