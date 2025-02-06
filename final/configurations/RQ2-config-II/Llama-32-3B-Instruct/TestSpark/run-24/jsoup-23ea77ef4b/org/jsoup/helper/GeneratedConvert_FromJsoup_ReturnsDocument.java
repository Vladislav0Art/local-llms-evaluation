package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.List;

public class GeneratedConvert_FromJsoup_ReturnsDocument {

    @Test
    public void convert_FromJsoup_ReturnsDocument() {
        Document in = new Document();
        Document out = W3CDom.convert(in);
        assertNotNull(out);
    }

}