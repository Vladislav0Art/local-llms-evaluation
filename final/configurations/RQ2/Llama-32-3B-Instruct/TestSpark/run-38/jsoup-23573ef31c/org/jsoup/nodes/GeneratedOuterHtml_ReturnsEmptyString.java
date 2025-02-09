package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedOuterHtml_ReturnsEmptyString {

    @Test
    public void outerHtml_ReturnsEmptyString() {
        Document document = new Document("");
        assertEquals("", document.outerHtml());
    }

}