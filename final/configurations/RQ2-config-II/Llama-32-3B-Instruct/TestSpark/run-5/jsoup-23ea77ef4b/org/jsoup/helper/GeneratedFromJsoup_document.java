package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedFromJsoup_document {

    @Test
    public void fromJsoup_document() throws Exception {
        Document jsDoc = new org.jsoup.nodes.Document();
        Document wDoc = W3CDom.fromJsoup(jsDoc);
        assertNotNull(wDoc);
    }

}