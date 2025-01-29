package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.jsoup.safety.Safelist.*;

public class GeneratedSimpleText {

    @Test
    public void simpleText() {
        Safelist safeList = simpleText();
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a>");
        Assertions.assertTrue(safeList.isSafeTag("a"));
    }

}