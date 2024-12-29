package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestJsoupPut {

    @Test
    public void testJsoupPut() {
        Document document = Jsoup.connect("http://example.com").get();
        Elements elements = document.select("*");
        assertEquals(0, elements.size());
        Element element = new Element("+a", "", "existing-key", "updated-value");
        element.attr("id", "key");
        document.body().append(element);
        assertEquals(1, elements.size());
    }

}