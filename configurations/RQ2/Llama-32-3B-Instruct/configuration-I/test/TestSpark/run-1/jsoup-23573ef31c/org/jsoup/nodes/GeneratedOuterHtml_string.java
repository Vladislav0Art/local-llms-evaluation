package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Connection;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.OutputSettings;
import org.jsoup.nodes.Parser;
import org.jsoup.nodes.QuirksMode;
import org.jsoup.options.Charset;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtml_string {

    @Test
    public void outerHtml_string() {
        Document document = new Document("http://example.com");
        document.appendChild(document.createElement("html"));
        document.appendChild(document.createElement("body"));
        document.body.appendChild(document.createElement("text"));
        assertEquals("<html><body><text></text></body></html>", document.outerHtml());
    }

}