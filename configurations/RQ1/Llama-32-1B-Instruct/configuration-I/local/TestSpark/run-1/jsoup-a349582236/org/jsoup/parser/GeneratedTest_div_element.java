package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest_div_element {

    public static Element createDivTag(String html) {
        Document doc = Jsoup.parse(html);
        Element tag = doc.createElement("div");
        return tag;
    }

    @Test
    public void test_div_element() {
        String html = "<html><body><div>Some div</div></body></html>";
        Element tag = createDivTag(html);
        System.out.println(tag.attr("class"));  // Output: tag
    }

}