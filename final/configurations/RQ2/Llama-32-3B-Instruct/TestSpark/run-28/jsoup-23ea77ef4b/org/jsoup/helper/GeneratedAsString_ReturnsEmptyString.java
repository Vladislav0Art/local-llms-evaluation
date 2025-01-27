package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedAsString_ReturnsEmptyString {

    @Test
    public void asString_ReturnsEmptyString() {
        Document inDoc = null;
        String result = W3CDom.asString(inDoc, null);
        assertEquals("", result);
    }

}