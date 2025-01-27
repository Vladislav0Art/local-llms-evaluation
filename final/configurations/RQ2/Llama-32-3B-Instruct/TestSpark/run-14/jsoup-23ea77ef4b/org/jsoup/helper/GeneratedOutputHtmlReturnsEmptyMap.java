package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.W3CDom;

public class GeneratedOutputHtmlReturnsEmptyMap {

    @Test
    public void OutputHtmlReturnsEmptyMap() {
        Map<String, String> result = W3CDom.OutputHtml();
        assertTrue(result.isEmpty());
    }

}