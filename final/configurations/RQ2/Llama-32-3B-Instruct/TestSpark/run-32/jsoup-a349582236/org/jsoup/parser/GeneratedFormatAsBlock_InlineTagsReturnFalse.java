package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedFormatAsBlock_InlineTagsReturnFalse {

    @Test
    public void formatAsBlock_InlineTagsReturnFalse() {
        Tag tag = new Tag("p");
        assertFalse(tag.formatAsBlock());
    }

}