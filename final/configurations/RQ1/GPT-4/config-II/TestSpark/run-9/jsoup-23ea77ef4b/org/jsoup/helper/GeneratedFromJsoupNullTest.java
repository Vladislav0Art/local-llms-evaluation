package org.jsoup.helper;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

public class GeneratedFromJsoupNullTest {

    @Test
    public void fromJsoupNullTest() {
        W3CDom w3CDom = new W3CDom();
        Document result = w3CDom.fromJsoup(null);
        assertNull(result);
    }

}