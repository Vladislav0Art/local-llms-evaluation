package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.jsoup.safety.Safelist.*;

public class GeneratedRemoveProtocols_ {

    @Test
    public void removeProtocols_() {
        Safelist safeList = none();
        safeList.removeProtocols("img");
        Document document = new Document();
        document.append("<a href=\"#\"><img src=\"image.jpg\" alt=\"Image\"></a>");
        Assertions.assertFalse(safeList.isSafeTag("img"));
    }

}