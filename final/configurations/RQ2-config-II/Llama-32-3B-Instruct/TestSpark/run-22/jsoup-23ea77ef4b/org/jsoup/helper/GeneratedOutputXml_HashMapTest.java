package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedOutputXml_HashMapTest {

    @Test
    public void OutputXml_HashMapTest() {
        HashMap<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
    }

}