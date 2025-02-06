package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedOutputXml_ReturnsMap {

    @Test
    public void OutputXml_ReturnsMap() {
        Map<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
    }

}