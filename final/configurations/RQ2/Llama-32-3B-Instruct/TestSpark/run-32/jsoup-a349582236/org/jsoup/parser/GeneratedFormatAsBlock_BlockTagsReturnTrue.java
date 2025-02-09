package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedFormatAsBlock_BlockTagsReturnTrue {

    @Test
    public void formatAsBlock_BlockTagsReturnTrue() throws IOException, InterruptedException {
        Tag tag = new Tag("div");
        assertTrue(tag.formatAsBlock());
    }

}