package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.List;

public class GeneratedConvert_FromElement_FromOut_ReturnsDocument {

    @Test
    public void convert_FromElement_FromOut_ReturnsDocument() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Document out = new Document();
        W3CDom.convert(in, out);
        assertNotNull(out);
    }

}