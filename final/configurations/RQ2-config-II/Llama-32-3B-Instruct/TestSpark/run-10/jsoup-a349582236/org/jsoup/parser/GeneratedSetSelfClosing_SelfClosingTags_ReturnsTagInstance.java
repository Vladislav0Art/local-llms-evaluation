package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_SelfClosingTags_ReturnsTagInstance {

    @Test
    public void setSelfClosing_SelfClosingTags_ReturnsTagInstance() {
        Tag tag = new Tag("input");
        Tag result = tag.setSelfClosing();
        assertNotNull(result);
    }

}