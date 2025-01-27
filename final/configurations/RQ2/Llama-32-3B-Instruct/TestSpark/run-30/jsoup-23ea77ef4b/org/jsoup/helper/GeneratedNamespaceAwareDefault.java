package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

public class GeneratedNamespaceAwareDefault {

    @Test
    public void namespaceAwareDefault() {
        assertTrue(W3CDom.namespaceAware());
    }

}