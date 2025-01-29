package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedBasicWithImagesRelaxed {

    @Test
    public void basicWithImagesRelaxed() {
        Document document = new Document();
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertFalse(safelist.isSafeTag("img"));
        Assert.assertFalse(safelist.getEnforcedAttributes("img"));
        assert safelist.isSafeTag("a");
        Assert.assertTrue(safelist.getEnforcedAttributes("a"));
    }

}