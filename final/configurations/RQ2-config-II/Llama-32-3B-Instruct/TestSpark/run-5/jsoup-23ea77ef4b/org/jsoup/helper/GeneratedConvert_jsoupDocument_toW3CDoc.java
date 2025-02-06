package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedConvert_jsoupDocument_toW3CDoc {

    @Test
    public void convert_jsoupDocument_toW3CDoc() throws Exception {
        Document doc = new org.w3c.dom.Document();
        Document wDoc = W3CDom.convert(new org.jsoup.nodes.Document());
        assertNotNull(wDoc);
    }

}