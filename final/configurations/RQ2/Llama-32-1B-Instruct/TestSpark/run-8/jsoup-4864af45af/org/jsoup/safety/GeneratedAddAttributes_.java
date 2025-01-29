package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.jsoup.safety.Safelist.*;

public class GeneratedAddAttributes_ {

    @Test
    public void addAttributes_() {
        Safelist safeList = none();
        safeList.addAttributes("a", "href=\"https://example.com\"");
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a>");
        Assertions.assertTrue(safeList.isSafeAttribute("a", "href"));
    }

}