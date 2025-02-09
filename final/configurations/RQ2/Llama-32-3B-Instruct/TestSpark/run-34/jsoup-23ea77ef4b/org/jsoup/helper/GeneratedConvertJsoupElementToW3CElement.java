package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

public class GeneratedConvertJsoupElementToW3CElement {

    @Test
    public void convertJsoupElementToW3CElement() {
        Element soupEl = new Element();
        soupEl.text("Hello World!");
        Element w3cEl = new Element();
        W3CDom.convert(soupEl, w3cEl);
        assertNotNull(w3cEl);
    }

}