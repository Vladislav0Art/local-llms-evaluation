package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;

public class GeneratedOutputHtml_ReturnsHashMap {

    @Test
    public void OutputHtml_ReturnsHashMap() {
        HashMap<String, String> actual = W3CDom.OutputHtml();
        assertNotNull(actual);
    }

}