package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNamespaceAware_SetReturnsFalse {

    @Test
    public void namespaceAware_SetReturnsFalse() {
        boolean result = W3CDom.namespaceAware(false);
        assertFalse(result);
    }

}