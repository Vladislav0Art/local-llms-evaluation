package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedAddAttributes_AddsNewAttributesToSafelistTest {

    @Test
    public void addAttributes_AddsNewAttributesToSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img");
        safelist = Safelist.addAttributes("img", "alt", "example");
        assertEquals(1, ((Attribute) new Attributes().add("alt")).getIntValue());
    }

}