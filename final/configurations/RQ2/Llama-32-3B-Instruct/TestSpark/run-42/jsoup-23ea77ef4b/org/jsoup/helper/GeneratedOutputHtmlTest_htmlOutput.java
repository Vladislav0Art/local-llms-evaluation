package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedOutputHtmlTest_htmlOutput {

    @Test
    public void OutputHtmlTest_htmlOutput() {
        Document doc = new org.jsoup.nodes.Document();
        Map<String, String> properties = W3CDom.OutputHtml();
        assertEquals(1, properties.size());
    }

}