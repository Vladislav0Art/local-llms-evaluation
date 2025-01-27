package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedFormatAsBlock_TagWithoutBlockAttributeReturnsFalse {

    @Test
    public void formatAsBlock_TagWithoutBlockAttributeReturnsFalse() {
        assertFalse(Tag.formatAsBlock("p"));
    }

}