package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedNamespaceAware_set_to_false {

    @Test
    public void namespaceAware_set_to_false() {
        W3CDom w3cDom = new W3CDom();
        assertFalse(w3cDom.namespaceAware(true));
    }

}