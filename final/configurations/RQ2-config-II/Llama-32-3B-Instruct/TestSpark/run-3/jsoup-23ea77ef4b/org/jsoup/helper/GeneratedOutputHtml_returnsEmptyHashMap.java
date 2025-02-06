package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedOutputHtml_returnsEmptyHashMap {

    @Test
    public void OutputHtml_returnsEmptyHashMap() {
        HashMap<String, String> expected = new HashMap<>();
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertEquals(expected, result);
    }

}