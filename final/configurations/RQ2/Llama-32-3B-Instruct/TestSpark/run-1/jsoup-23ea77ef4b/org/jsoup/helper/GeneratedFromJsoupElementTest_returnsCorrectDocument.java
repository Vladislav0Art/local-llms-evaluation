package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class GeneratedFromJsoupElementTest_returnsCorrectDocument {

    @Test
    public void fromJsoupElementTest_returnsCorrectDocument() {
        Element element = new org.jsoup.nodes.Element();
        Document result = W3CDom.fromJsoupElement(element);
        assertEquals(1, result.text().length());
    }

}