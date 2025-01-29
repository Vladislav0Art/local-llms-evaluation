package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedRemoveEnforcedAttribute_Safelist {

    private Document document;

    @Test
    public void removeEnforcedAttribute_Safelist() {
        Safelist list = Safelist.preserveRelativeLinks(false);
        List<String> tags = new ArrayList<>();
        tags.add("a", "href=\"https://example.com\"");
        Assert.assertFalse(list.isSafeTag(tags, false));
        document = Safelist.getDocument(list);
    }

}