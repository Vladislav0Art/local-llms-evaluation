package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedOutputHtml_HashMapTest {

    @Test
    public void OutputHtml_HashMapTest() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
    }

}