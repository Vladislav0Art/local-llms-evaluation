package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedIsSelfClosing_TagWithSelfClosingAttribute_ReturnsTrue {

    @Test
    public void isSelfClosing_TagWithSelfClosingAttribute_ReturnsTrue() {
        Tag tag = new Tag("img");
        assertTrue(tag.isSelfClosing());
    }

}