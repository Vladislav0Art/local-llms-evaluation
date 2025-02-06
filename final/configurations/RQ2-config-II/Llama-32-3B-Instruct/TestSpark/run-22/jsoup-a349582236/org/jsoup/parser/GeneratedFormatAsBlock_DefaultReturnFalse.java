package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_DefaultReturnFalse {

    @Test
    public void formatAsBlock_DefaultReturnFalse() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

}