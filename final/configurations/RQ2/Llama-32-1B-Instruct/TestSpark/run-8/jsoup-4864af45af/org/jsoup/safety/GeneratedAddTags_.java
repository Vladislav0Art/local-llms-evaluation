package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.jsoup.safety.Safelist.*;

public class GeneratedAddTags_ {

    @Test
    public void addTags_() {
        Safelist safeList = none();
        safeList.addTags("span", "class=\"test\"");
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a><span class=\"test\"></span>");
        Assertions.assertTrue(safeList.isSafeTag("span"));
    }

}