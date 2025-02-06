package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedFromJsoup_element {

    @Test
    public void fromJsoup_element() throws Exception {
        Element jsElement = new org.jsoup.nodes.Element();
        Document wDoc = W3CDom.fromJsoup(jsElement);
        assertNotNull(wDoc);
    }

}