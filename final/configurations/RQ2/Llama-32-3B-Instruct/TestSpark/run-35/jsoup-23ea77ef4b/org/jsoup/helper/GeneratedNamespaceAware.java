package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedNamespaceAware {

    @Test
    public void namespaceAware() {
        assertTrue(W3CDom.namespaceAware());
    }

}