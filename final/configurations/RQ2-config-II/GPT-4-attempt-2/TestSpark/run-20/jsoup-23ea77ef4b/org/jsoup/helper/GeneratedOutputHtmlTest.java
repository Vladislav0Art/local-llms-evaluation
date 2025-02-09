package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Properties;

public class GeneratedOutputHtmlTest {

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> outputHtml = W3CDom.OutputHtml();
        assertNotNull(outputHtml);
        assertEquals("html", outputHtml.get(OutputKeys.METHOD));
    }

}