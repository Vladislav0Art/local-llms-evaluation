package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedBasicNoTags {

    @Test
    public void basicNoTags() {
        Document document = new Document();
        Safelist safelist = Safelist.basic();
        Assert.assertFalse(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.getEnforcedAttributes("a"));
    }

}