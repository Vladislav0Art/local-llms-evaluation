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

public class GeneratedW3CDomInitializationTest {

    @Test
    public void W3CDomInitializationTest() {
        W3CDom w3cDom = new W3CDom();
        assertNotNull(w3cDom);
    }

}