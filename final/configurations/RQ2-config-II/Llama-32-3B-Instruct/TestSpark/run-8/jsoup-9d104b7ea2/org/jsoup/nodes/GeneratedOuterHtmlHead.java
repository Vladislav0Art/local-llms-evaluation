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

public class GeneratedOuterHtmlHead {

    @Test
    public void outerHtmlHead() {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        Document.OutputSettings settings = new Document.OutputSettings();

        Element html = new Element("html");
        html.appendChild(new TextNode("Hello"));
        html.appendChild(new TextNode("<br/>"));

        html.outerHtmlHead(ba, 0, settings);
        assertEquals("<html>Hello<br/>", ba.toString());
    }

}