package org.jsoup.helper;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

public class GeneratedOutputXmlTest {

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
        assertEquals("xml", result.get("method"));
    }

}