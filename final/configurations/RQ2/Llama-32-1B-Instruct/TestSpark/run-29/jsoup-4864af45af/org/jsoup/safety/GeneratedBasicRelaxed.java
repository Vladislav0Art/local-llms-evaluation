package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedBasicRelaxed {

    @Test
    public void basicRelaxed() {
        Document document = new Document();
        Safelist safelist = Safelist.basic();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertTrue(safelist.getEnforcedAttributes("a"));
    }

}