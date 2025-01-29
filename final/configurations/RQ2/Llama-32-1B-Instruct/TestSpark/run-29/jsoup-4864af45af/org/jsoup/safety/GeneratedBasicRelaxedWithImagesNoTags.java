package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedBasicRelaxedWithImagesNoTags {

    @Test
    public void basicRelaxedWithImagesNoTags() {
        Document document = new Document();
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertTrue(safelist.getEnforcedAttributes("a"));
    }

}