package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.jsoup.safety.Safelist.*;

public class GeneratedRelaxed_ {

    @Test
    public void relaxed_() {
        Safelist safeList = relaxed();
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a><img src=\"image.jpg\" alt=\"Image\"></a>");
        Assertions.assertTrue(safeList.isSafeTag("a"));
    }

}