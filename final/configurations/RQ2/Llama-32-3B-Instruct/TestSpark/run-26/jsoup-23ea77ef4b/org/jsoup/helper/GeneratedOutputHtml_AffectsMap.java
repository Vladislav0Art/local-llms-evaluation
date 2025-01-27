package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.select.NodeTraversor;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedOutputHtml_AffectsMap {

    @Test
    public void OutputHtml_AffectsMap() {
        Map<String, String> map = W3CDom.OutputHtml();
        assertNotNull(map);
    }

}