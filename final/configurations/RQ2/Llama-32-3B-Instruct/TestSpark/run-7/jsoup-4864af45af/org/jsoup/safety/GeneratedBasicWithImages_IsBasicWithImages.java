package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasicWithImages_IsBasicWithImages {

    @Test
    public void basicWithImages_IsBasicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        Validate.isTrue(safelist.isSafeTag("img"));
    }

}