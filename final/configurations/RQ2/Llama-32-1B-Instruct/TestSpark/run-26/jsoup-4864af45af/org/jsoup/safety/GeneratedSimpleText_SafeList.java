package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedSimpleText_SafeList {

    private Document document;

    @Test
    public void simpleText_SafeList() {
        Safelist list = Safelist.none();
        Assert.assertTrue(list.isSafeTag("a"));
        Assert.assertFalse(list.isSafeTag("p"));
        Assert.assertFalse(list.isSafeTag(""));
        document = Safelist.getDocument(list);
    }

}