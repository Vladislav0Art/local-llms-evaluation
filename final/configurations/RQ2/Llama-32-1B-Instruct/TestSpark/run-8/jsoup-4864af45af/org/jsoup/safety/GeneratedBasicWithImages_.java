package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.jsoup.safety.Safelist.*;

public class GeneratedBasicWithImages_ {

    @Test
    public void basicWithImages_() {
        Safelist safeList = basicWithImages();
        Document document = new Document();
        document.append("<a href=\"#\">Click me</a><img src=\"image.jpg\" alt=\"Image\"></a>");
        Assertions.assertTrue(safeList.isSafeTag("a") && safeList.isSafeTag("img"));
    }

}