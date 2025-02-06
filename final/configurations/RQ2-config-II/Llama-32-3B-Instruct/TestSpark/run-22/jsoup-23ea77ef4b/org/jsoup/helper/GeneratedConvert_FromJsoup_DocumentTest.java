package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedConvert_FromJsoup_DocumentTest {

    @Test
    public void convert_FromJsoup_DocumentTest() {
        Document in = new Document();
        Document out = W3CDom.convert(in);
        assertNotNull(out);
    }

}