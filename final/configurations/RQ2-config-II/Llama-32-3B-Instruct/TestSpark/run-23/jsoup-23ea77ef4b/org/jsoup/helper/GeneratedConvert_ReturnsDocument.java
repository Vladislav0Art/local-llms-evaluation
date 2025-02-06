package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConvert_ReturnsDocument {

    @Test
    public void convert_ReturnsDocument() {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        Document out = W3CDom.convert(in);
        assertNotNull(out);
    }

}