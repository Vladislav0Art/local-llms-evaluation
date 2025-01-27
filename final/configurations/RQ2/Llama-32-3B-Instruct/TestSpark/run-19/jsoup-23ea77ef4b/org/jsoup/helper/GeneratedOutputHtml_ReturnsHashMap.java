package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedOutputHtml_ReturnsHashMap {

    @Test
    public void OutputHtml_ReturnsHashMap() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

}