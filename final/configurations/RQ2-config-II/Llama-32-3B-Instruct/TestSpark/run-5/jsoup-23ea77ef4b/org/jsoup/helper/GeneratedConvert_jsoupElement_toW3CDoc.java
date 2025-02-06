package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedConvert_jsoupElement_toW3CDoc {

    @Test
    public void convert_jsoupElement_toW3CDoc() throws Exception {
        org.jsoup.nodes.Element jsElement = new org.jsoup.nodes.Element();
        Document wDoc = W3CDom.convert(jsElement);
        assertNotNull(wDoc);
    }

}