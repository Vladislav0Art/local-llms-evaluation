package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertFromJsoupElementTest {

    @Test
    public void convertFromJsoupElementTest() {
        Element element = new Element();
        Document wDoc = W3CDom.fromJsoup(element);
        assertNotNull(wDoc);
    }

}