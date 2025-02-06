package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedOutputHtmlTest {

    @Test
    public void OutputHtmlTest() {
        Document doc = org.jsoup.Jsoup.parse("<html><body>Hello World!</body></html>");
        HashMap<String, String> output = W3CDom.OutputHtml();
        assertNotNull(output);
    }

}