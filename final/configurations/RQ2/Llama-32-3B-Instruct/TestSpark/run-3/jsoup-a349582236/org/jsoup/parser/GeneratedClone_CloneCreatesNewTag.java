package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedClone_CloneCreatesNewTag {

    @Test
    public void clone_CloneCreatesNewTag() throws CloneNotSupportedException {
        Tag originalTag = new Tag();
        Tag clonedTag = (Tag) originalTag.clone();
        assertNotSame(originalTag, clonedTag);
    }

}