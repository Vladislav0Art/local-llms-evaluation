package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedGetTagType_NormalTagType_ReturnsCorrectTagType {

    @Test
    public void getTagType_NormalTagType_ReturnsCorrectTagType() {
        Tag tag = new Tag(tagName);
        // Use a public method to create and return the Tag object here
        // For example:
        return tag;
    }

    public static class Tag {
        private String tagName;

        public Tag(String tagName) {
            this.tagName = tagName;
        }

        public String getTagName() {
            return tagName;
        }
    }

}