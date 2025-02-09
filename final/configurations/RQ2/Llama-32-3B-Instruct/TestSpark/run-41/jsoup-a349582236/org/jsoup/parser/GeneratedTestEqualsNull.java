package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.jsoup.helper.Validate;

public class GeneratedTestEqualsNull {

    public static class Tag {
        private String name;
        private boolean selfClosing;
        private boolean formListed;
        private boolean formSubmittable;

        public Tag() {
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isBlock() {
            return false;
        }

        public boolean isInline() {
            return false;
        }

        public boolean isEmpty() {
            return true;
        }

        public boolean isSelfClosing() {
            this.selfClosing = true;
            return this.selfClosing;
        }

        public void setSelfClosing(boolean selfClosing) {
            this.selfClosing = selfClosing;
        }

        public boolean equals(Object obj) {
            return false;
        }
    }

    @Test
    public void testEqualsNull() {
        assertNotEquals(null, new Tag());
    }

}