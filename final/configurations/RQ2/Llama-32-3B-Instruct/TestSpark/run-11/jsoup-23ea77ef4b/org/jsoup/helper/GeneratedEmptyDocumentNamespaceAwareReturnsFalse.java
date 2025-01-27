package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEmptyDocumentNamespaceAwareReturnsFalse {

    @Test
    public void emptyDocumentNamespaceAwareReturnsFalse() {
        assertFalse(W3CDom.namespaceAware());
    }

}