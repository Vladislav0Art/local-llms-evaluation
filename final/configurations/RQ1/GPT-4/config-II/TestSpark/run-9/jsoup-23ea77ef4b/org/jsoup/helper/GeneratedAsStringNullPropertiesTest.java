package org.jsoup.helper;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

public class GeneratedAsStringNullPropertiesTest {

    @Test
    public void asStringNullPropertiesTest() {
        Document doc = W3CDom.convert(new Node("test"));
        String result = W3CDom.asString(doc, null);
        assertNotNull(result);
    }

}