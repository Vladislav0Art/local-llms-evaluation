package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedConvert_element_toJsoupDocument {

    @Test
    public void convert_element_toJsoupDocument() throws Exception {
        Document doc = new org.w3c.dom.Document();
        W3CDom.convert(doc, new org.jsoup.nodes.Document());
    }

}