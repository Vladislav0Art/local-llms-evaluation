package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.List;

public class GeneratedConvert_FromDoc_FromOut_ReturnsDocument {

    @Test
    public void convert_FromDoc_FromOut_ReturnsDocument() {
        Document in = new Document();
        Document out = new Document();
        W3CDom.convert(in, out);
        assertEquals(in, out);
    }

}