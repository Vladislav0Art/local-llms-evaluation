package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedOutputHtmlTest {

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> map = W3CDom.OutputHtml();
        assertEquals("html", map.get("method"));
    }

}