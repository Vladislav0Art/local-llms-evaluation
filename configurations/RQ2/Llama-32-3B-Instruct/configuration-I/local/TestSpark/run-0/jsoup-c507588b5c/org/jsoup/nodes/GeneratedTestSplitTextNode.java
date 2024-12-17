package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

public class GeneratedTestSplitTextNode {

    @Test
    public void testSplitTextNode() throws Exception {
        String html = "<html><body>This is a <span>test</span> text.</body></html>";
        Document soup = Jsoup.parse(html);
        String[] splitText = soup.body().text().split(" ");
        assertEquals(splitText.length, 5);
    }

}