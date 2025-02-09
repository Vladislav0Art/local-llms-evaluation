package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedAsStringDocWithoutProperties {

    @Test
    public void asStringDocWithoutProperties() {
        Document doc = W3CDom.convert(new org.jsoup.nodes.Document());
        String result = W3CDom.asString(doc);
        assertTrue(result.contains("<html"));
    }

}