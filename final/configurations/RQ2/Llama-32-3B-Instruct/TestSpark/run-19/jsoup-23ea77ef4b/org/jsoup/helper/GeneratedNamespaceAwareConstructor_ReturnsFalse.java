package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedNamespaceAwareConstructor_ReturnsFalse {

    @Test
    public void namespaceAwareConstructor_ReturnsFalse() {
        assertFalse(W3CDom.namespaceAware());
    }

}