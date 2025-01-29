package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.jsoup.safety.Safelist.*;

public class GeneratedPreserveRelativeLinks_ {

    @Test
    public void preserveRelativeLinks_() {
        Safelist safeList = none();
        safeList.preserveRelativeLinks(true);
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a>");
        Assertions.assertTrue(safeList.isSafeTag("a"));
    }

}