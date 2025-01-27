package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringWithPropertiesSetsCorrectOutput {

    @Test
    public void asStringWithPropertiesSetsCorrectOutput() {
        Map<String, String> properties = new HashMap<>();
        properties.put("method", "html");
        String result = W3CDom.asString(W3CDom.OutputHtml(), properties);
        assertEquals("html", result);
    }

}