package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Map;

public class GeneratedOutputXml_returnsEmptyHashMap {

    @Test
    public void OutputXml_returnsEmptyHashMap() {
        HashMap<String, String> expected = new HashMap<>();
        HashMap<String, String> result = W3CDom.OutputXml();
        assertEquals(expected, result);
    }

}