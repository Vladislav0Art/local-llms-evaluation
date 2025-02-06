package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedConvert_FromElement_DocumentTest {

    @Test
    public void convert_FromElement_DocumentTest() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Document out = W3CDom.convert(in);
        assertNotNull(out);
    }

}