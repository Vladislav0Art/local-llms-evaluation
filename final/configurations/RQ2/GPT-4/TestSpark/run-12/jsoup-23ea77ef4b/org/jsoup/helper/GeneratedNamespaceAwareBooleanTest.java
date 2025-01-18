package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.Test;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedNamespaceAwareBooleanTest {

    @Test
    public void namespaceAwareBooleanTest() {
        W3CDom object = new W3CDom().namespaceAware(false);
        assertFalse(object.namespaceAware());
    }

}