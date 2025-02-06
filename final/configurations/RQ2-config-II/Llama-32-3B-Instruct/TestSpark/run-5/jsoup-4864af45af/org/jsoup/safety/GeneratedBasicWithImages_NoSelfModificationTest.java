package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedBasicWithImages_NoSelfModificationTest {

    @Test
    public void basicWithImages_NoSelfModificationTest() {
        Safelist safelist = Safelist.basicWithImages();
        safelist.addTags("img");
        assertFalse(Safelist.isSafeTag("img"));
    }

}