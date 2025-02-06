package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedFromJsoup_FromElementTest {

    @Test
    public void fromJsoup_FromElementTest() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Document out = W3CDom.fromJsoup(in);
        assertNotNull(out);
    }

}