package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedOutputHtml_ReturnsMap {

    @Test
    public void OutputHtml_ReturnsMap() {
        Map<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
    }

}