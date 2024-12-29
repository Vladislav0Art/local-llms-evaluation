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
public class GeneratedTestJsoupDeclaredValueForKey {

    @Test
    public void testJsoupDeclaredValueForKey() {
        Document document = Jsoup.connect("http://example.com").get();
        Elements elements = document.select("*");
        assertTrue(!elements.hasDeclaredAttribute("key"));
    }

}