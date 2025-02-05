package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareBoolTest {

    @Test
    public void namespaceAwareBoolTest() {
        W3CDom instance = new W3CDom().namespaceAware(false);
        assertFalse(instance.namespaceAware());
    }

}