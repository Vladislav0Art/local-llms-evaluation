package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedRelaxedWithImages {

    @Test
    public void relaxedWithImages() {
        Document document = new Document();
        Safelist safelist = Safelist.relaxed();
        Document doc = new Document();
        Element a = document.createElement("a");
        a.setAttribute("href", "https://example.com");
        safelist.addTags("img", "a");
        safelist.addEnforcedAttribute("a", "src", "https://example.com/img.jpg");
        a.appendChild(document.createTextNode("<img src='https://example.com/img.jpg'>"));
        assert safelist.isSafeTag("a") == true;
        Assert.assertFalse(safelist.getEnforcedAttributes("a"));
    }

}