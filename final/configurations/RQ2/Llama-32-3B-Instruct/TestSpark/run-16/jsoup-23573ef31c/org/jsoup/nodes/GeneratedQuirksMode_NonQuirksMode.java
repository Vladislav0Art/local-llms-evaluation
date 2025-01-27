package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedQuirksMode_NonQuirksMode {

    @Test
    public void quirksMode_NonQuirksMode() {
        QuirksMode quirksMode = QuirksMode.CONSERVATIVE;
        Document document = new Document();
        document.quirksMode(quirksMode);
    }

}