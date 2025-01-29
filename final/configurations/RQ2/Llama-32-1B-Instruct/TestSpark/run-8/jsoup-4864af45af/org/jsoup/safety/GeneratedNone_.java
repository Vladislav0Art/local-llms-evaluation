package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.jsoup.safety.Safelist.*;

public class GeneratedNone_ {

    @Test
    public void none_() {
        Document document = new Document();
        Safelist safeList = none();
        Assertions.assertTrue(safeList.isSafeTag("a"));
    }

}