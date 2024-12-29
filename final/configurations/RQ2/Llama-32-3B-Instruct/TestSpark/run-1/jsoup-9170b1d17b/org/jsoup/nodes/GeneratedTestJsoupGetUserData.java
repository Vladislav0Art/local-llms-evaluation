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
public class GeneratedTestJsoupGetUserData {

    @Test
    public void testJsoupGetUserData() {
        Document document = Jsoup.connect("http://example.com").get();
        Element element = document.selectFirst("#id").first();
        String userData = element.attr("data-user-data");
        assertEquals(null, userData);
    }

}