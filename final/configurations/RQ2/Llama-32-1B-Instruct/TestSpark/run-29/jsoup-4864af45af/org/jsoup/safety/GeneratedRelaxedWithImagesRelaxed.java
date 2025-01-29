package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedRelaxedWithImagesRelaxed {

    @Test
    public void relaxedWithImagesRelaxed() {
        Document document = new Document();
        Safelist safelist = Safelist.relaxedWithImages();
        Assert.assertFalse(safelist.isSafeTag("img"));
        Assert.assertFalse(safelist.getEnforcedAttributes("img"));
    }

}