package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedSimpleTextRelaxed {

    @Test
    public void simpleTextRelaxed() {
        Document document = new Document();
        Safelist safelist = Safelist.simpleText();
        Assert.assertFalse(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.getEnforcedAttributes("a"));
    }

}