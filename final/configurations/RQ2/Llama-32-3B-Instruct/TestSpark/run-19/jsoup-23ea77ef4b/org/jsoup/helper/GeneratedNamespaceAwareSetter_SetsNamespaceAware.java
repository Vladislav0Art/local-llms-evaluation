package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedNamespaceAwareSetter_SetsNamespaceAware {

    @Test
    public void namespaceAwareSetter_SetsNamespaceAware() {
        boolean result = new W3CDom().namespaceAware(false);
        assertTrue(result);
    }

}