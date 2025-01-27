package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

public class GeneratedNamespaceAwareSetToFalse {

    @Test
    public void namespaceAwareSetToFalse() {
        assertFalse(W3CDom.namespaceAware(false));
    }

}