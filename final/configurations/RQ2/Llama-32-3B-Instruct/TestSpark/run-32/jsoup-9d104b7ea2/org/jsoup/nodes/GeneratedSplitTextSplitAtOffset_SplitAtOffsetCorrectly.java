package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedSplitTextSplitAtOffset_SplitAtOffsetCorrectly {

    @Test
    public void splitTextSplitAtOffset_SplitAtOffsetCorrectly() throws IOException {
        Document document = Jsoup.parse("<a>1<a><span>2</span></a><a>3</a>");
        String text = document.text();
        assertEquals("12 3", text());
    }

}