package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedOuterHtml_htmlReturned {

    @Test
    public void outerHtml_htmlReturned() {
        String html = "<html>example</html>";
        Document document = Document.createShell(html);
        assertEquals(html, document.outerHtml());
    }

}