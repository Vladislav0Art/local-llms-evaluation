package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedNamespaceAware_ReturnsNull {

    @Test
    public void namespaceAware_ReturnsNull() {
        W3CDom namespaceAware = new W3CDom();
        boolean result = namespaceAware.namespaceAware(false);
        Assert.assertFalse(result);
    }

}