package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedAddEnforcedAttribute_Safelist {

    private Document document;

    @Test
    public void addEnforcedAttribute_Safelist() {
        Safelist list = Safelist.preserveRelativeLinks(true);
        List<String> tags = new ArrayList<>();
        tags.add("a", "href=\"https://example.com\"");
        Assert.assertTrue(list.isSafeTag(tags, true));
        document = Safelist.getDocument(list);
    }

}