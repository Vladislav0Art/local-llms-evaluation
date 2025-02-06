package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedTitle SetsTitleProperly {

    @Test
    public void title

    SetsTitleProperly() {
        Document document = Document.createShell("");
        document.title("New Title");
        assertEquals("New Title", document.title());
    }

}