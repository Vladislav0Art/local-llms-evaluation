package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedFromJsoupElement {

    @Test
    public void fromJsoupElement() {
        Element element = new org.jsoup.nodes.Element();
        when(element.toString()).thenReturn(element.outerHtml());
        Document result = W3CDom.fromJsoup(element);
        assertNotNull(result);
    }

}