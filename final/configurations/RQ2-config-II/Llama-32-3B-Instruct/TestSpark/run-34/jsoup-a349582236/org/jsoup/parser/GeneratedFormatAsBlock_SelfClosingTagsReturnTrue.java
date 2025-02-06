package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_SelfClosingTagsReturnTrue {

    @Test
    public void formatAsBlock_SelfClosingTagsReturnTrue() {
        // Arrange and Act
        String tagName = "img";
        assertTrue(new Tag(tagName).formatAsBlock());
    }

}