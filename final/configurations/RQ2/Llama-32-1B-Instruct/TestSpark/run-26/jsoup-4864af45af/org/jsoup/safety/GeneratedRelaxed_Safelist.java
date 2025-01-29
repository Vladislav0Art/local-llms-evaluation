package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedRelaxed_Safelist {

    private Document document;

    @Test
    public void relaxed_Safelist() {
        Safelist list = Safelist.relaxed();
        List<String> tags = new ArrayList<>();
        tags.add("img", "src=\"image.jpg\"");
        Assert.assertTrue(list.isSafeTag(tags));
        document = Safelist.getDocument(list);
    }

}