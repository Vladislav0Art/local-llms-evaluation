package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedNamespaceAwareFalse {

    @Test
    public void namespaceAwareFalse() {
        W3CDom w3cdom = new W3CDom();
        assertFalse(w3cdom.namespaceAware(false));
    }

}