package org.jsoup.helper;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

public class GeneratedOutputHtmlTest {

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
        assertEquals("html", result.get("method"));
    }

}