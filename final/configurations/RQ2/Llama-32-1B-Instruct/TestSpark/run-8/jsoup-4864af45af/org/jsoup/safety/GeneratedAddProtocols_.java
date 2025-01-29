package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.jsoup.safety.Safelist.*;

public class GeneratedAddProtocols_ {

    @Test
    public void addProtocols_() {
        Safelist safeList = none();
        safeList.addProtocols("img", "src=\"image.jpg\"");
        Document document = new Document();
        document.append("<a href=\"#\"><img src=\"image.jpg\" alt=\"Image\"></a>");
        Assertions.assertTrue(safeList.isSafeTag("img"));
    }

}