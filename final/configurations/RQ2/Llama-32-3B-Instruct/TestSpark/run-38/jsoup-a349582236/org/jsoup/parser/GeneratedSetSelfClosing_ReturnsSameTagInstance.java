package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_ReturnsSameTagInstance {

    @Test
    public void setSelfClosing_ReturnsSameTagInstance() {
        Tag tag = new Tag();
        Tag obtainedTag = tag.setSelfClosing();
        assertSame(tag, obtainedTag);
    }

}