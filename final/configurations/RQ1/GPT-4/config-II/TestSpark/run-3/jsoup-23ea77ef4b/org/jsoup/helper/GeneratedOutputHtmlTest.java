package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedOutputHtmlTest {

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> htmlOutput = W3CDom.OutputHtml();

        assertNotNull(htmlOutput);
        assertTrue(htmlOutput.containsKey("method"));
        assertEquals("html", htmlOutput.get("method"));
    }

}