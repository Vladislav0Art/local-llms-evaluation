package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedOutputHtmlTest {

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> outputHtmlMap = W3CDom.OutputHtml();
        assertEquals("html", outputHtmlMap.get("method"));
    }

}