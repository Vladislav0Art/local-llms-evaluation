package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAsString_ReturnsString {

    @Test
    public void asString_ReturnsString() {
        Document doc = new Document();
        String result = W3CDom.asString(doc, null);
        assertNotNull(result);
    }

}