package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedNamespaceAware_ReturnsBoolean {

    @Test
    public void namespaceAware_ReturnsBoolean() {
        boolean result = W3CDom.namespaceAware();
        Assert.assertTrue(result);
    }

}