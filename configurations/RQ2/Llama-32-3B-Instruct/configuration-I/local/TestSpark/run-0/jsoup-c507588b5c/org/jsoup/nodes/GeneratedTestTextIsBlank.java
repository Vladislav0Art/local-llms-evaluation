package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

public class GeneratedTestTextIsBlank {

    @Test
    public void testTextIsBlank() throws IOException {
        String html = "";
        Jsoup soup = Jsoup.parse(html);
        TextNode clone = new TextNode();

        assertTrue(clone.isBlank());

        assertFalse(clone.isBlank());
    }

}