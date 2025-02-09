package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_DefinedTagReturnsCorrectTagInstance {

    @Test
    public void valueOf_DefinedTagReturnsCorrectTagInstance() {
        Tag tag = new Tag();
        Tag obtainedTag = Tag.valueOf(tag.getName());
        assertSame(tag, obtainedTag);
    }

}