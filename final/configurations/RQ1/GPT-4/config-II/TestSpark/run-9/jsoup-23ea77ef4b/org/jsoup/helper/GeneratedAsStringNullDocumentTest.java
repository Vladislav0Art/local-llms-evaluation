package org.jsoup.helper;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

public class GeneratedAsStringNullDocumentTest {

    @Test
    public void asStringNullDocumentTest() {
        String result = W3CDom.asString(null, null);
        assertNull(result);
    }

}