package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedAsStringDocument_ReturnsEmptyString {

    @Test
    public void asStringDocument_ReturnsEmptyString() {
        Document doc = null;
        String result = W3CDom.asString(doc, null);
        assertEquals("", result);
    }

}