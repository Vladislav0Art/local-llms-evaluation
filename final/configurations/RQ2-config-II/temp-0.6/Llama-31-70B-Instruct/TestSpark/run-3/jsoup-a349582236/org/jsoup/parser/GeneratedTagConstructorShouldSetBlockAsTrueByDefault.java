package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTagConstructorShouldSetBlockAsTrueByDefault {

    @Test
    public void tagConstructorShouldSetBlockAsTrueByDefault() {
        Tag tag = new Tag("tagName");
        assertTrue(tag.isBlock);
    }

}