package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedOutputXmlTest {

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
    }

}