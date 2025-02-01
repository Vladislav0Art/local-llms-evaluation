package org.jsoup.helper;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

public class GeneratedConvertNullTest {

    @Test
    public void convertNullTest() {
        Document result = W3CDom.convert(null);
        assertNull(result);
    }

}