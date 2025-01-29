package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.jsoup.safety.Safelist.*;

public class GeneratedRemoveAttributes_ {

    @Test
    public void removeAttributes_() {
        Safelist safeList = none();
        safeList.removeAttributes("a");
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a>");
        Assertions.assertFalse(safeList.isSafeAttribute("a", "href"));
    }

}