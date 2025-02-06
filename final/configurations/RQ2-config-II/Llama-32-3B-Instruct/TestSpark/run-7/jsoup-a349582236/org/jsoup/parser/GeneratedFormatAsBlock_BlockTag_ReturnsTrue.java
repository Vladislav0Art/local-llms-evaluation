package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_BlockTag_ReturnsTrue {

    @Test
    public void formatAsBlock_BlockTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setBlock(true);
        Validate.isTrue(tag.formatAsBlock());
    }

}