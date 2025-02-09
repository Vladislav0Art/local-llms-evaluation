package org.jsoup.parser;

import org.jsoup.helper.ParseSettings;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedTest {

    public static class Tag {
        private boolean selfClosing;
        private boolean formListed;
        private boolean formSubmittable;

        public boolean isSelfClosing() {
            this.selfClosing = true;
            return this.selfClosing;
        }

        public void setSelfClosing(boolean selfClosing) {
            this.selfClosing = selfClosing;
        }
    }

    @Test
    public void testSelfClosing() {
        Tag tag = new Tag();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void testEqualsNull() {
        assertNotEquals(null, new Tag());
    }

    @Test
    public void testEqualsItself() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        assertTrue(tag1.equals(tag2));
    }

}