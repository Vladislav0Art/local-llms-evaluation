package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class GeneratedAsString_NullProperties_ReturnsNull {

    @Test
    public void asString_NullProperties_ReturnsNull() {
        String result = W3CDom.asString(null, null);
        assertNull(result);
    }

}