package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.jsoup.safety.Safelist.*;

public class GeneratedCopy_ {

    @Test
    public void copy_() {
        Safelist safeList1 = none();
        Safelist safeList2 = safeList1.copy();
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a>");
        Assertions.assertTrue(safeList1.isSafeTag("a"));
        Assertions.assertFalse(safeList2.isSafeTag("a"));
    }

}