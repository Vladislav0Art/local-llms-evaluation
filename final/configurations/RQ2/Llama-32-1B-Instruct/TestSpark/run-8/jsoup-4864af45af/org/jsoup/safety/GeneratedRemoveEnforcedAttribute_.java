package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.jsoup.safety.Safelist.*;

public class GeneratedRemoveEnforcedAttribute_ {

    @Test
    public void removeEnforcedAttribute_() {
        Safelist safeList = none();
        safeList.removeEnforcedAttribute("span", "");
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a><span class=\"test\"></span>");
        Assertions.assertFalse(safeList.isSafeAttribute("span", "class"));
    }

}