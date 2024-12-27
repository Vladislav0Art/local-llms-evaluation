package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlHead_OuterHtmlHead {

    @Test
    public void outerHtmlHead_OuterHtmlHead() throws IOException {
        Element element = new Element();
        Appendable appendable = new StringBuilder();
        element.outerHtmlHead(appendable, 0, null);
        assertEquals("<html><body></body></html>", appendable.toString());
    }

}