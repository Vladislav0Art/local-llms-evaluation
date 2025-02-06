package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.List;

public class GeneratedFromJsoup_FromElement_ReturnsDocument {

    @Test
    public void fromJsoup_FromElement_ReturnsDocument() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Document out = W3CDom.fromJsoup(in).getDocument();
        assertNotNull(out);
    }

}