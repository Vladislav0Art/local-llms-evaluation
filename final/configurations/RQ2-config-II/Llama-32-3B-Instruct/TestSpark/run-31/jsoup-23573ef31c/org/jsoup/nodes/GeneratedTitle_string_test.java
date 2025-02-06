package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTitle_string_test {

    @Test
    public void title_string_test() {
        String title = "Hello World";
        Document document = Document.createShell("http://example.com").title(title);
        assertEquals(title, document.title());
    }

}