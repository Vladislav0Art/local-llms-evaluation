package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedFromJsoupElement_WillConvertToW3CElement {

    @Test
    public void fromJsoupElement_WillConvertToW3CElement() {
        Element soupEl = new Element();
        soupEl.text("Hello World!");
        Document w3cEl = W3CDom.fromJsoup(soupEl);
        assertNotNull(w3cEl);
    }

}