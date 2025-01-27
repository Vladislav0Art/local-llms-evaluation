package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedWholeText {

    @Test
    public void wholeText() throws IOException {
        Document document = Jsoup.parse("<html><body>test</body></html>");
        assertEquals("test", document.body().getWholeText());
    }

}