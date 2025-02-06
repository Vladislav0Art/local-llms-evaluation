package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedOutputXml_ReturnsHashMap {

    @Test
    public void OutputXml_ReturnsHashMap() {
        HashMap<String, String> actual = W3CDom.OutputXml();
        assertNotNull(actual);
    }

}