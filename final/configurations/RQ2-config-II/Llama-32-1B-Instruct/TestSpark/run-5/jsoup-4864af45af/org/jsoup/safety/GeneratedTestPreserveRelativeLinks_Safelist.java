package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedTestPreserveRelativeLinks_Safelist {

    @Test
    public void testPreserveRelativeLinks_Safelist() {
        Safelist safeList = new Safelist();
        safeList.preserveRelativeLinks(true);
        assertTrue(safeList.isSafeTag("a href=\"https://www.example.com\""));
    }

}