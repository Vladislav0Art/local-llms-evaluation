package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.HashMap;
import java.util.List;

public class GeneratedOutputHtml_ReturnsHashMap {

    @Test
    public void OutputHtml_ReturnsHashMap() {
        HashMap<String, String> out = W3CDom.OutputHtml();
        assertNotNull(out);
    }

}