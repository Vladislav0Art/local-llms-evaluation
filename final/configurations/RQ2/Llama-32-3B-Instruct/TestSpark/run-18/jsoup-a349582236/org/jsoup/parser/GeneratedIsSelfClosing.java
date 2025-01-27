package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing {

    @Test
    public void isSelfClosing() {
        Tag selfClosingTag = new Tag();
        selfClosingTag.setName("img");
        assertTrue(selfClosingTag.isSelfClosing());
    }

}