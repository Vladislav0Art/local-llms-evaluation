package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedClone_ReturnsCloneOfOriginalTag {

    @Test
    public void clone_ReturnsCloneOfOriginalTag() {
        Tag originalTag = new Tag();
        Tag clonedTag = originalTag.clone();
        assertEquals(originalTag, clonedTag);
    }
}

class ParseSettings {
}

}