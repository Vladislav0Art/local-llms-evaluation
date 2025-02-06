package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.List;

public class GeneratedOutputXml_ReturnsHashMap {

    @Test
    public void OutputXml_ReturnsHashMap() {
        HashMap<String, String> out = W3CDom.OutputXml();
        assertNotNull(out);
    }

}