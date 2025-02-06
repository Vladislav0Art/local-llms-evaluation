package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedOuterHtmlTailEmpty {

    @Test
    public void outerHtmlTailEmpty() {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings();

        Element html = new Element("html");

        html.outerHtmlTail(ba, 0, settings);
        assertEquals("", ba.toString());
    }

}