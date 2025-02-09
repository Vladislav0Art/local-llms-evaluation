package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedOutputXml {

    @Test
    public void OutputXml() {
        Map<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
        assertTrue(result.containsKey("method"));
        assertTrue(result.get("method").equals(METHOD));
    }

}