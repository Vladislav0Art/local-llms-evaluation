package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_ThrowsIllegalStateException_NoNameSet {

    @Test
    public void normalName_ThrowsIllegalStateException_NoNameSet() {
        Tag tag = new Tag();
        assertThrows(IllegalStateException.class, () -> tag.normalName());
    }

}