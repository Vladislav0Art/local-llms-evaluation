package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class GeneratedTestTagSetSelfClosing {

    public static class Tag {
        private String name;
        private boolean selfClosing;
        private boolean preserveWhitespace;
        private boolean isBlock;
        private boolean isInline;
        private boolean isEmpty;
        private boolean isSelfClosing;
        private boolean isFormSubmittable;

        public Tag(String name, ParseSettings settings) {
            this.name = name;
            if (settings == null) {
                throw new NullPointerException();
            }
            selfClosing = settings.isSelfClosing();
            preserveWhitespace = settings.preserveWhitespace();
            isBlock = !settings.isInline();
            isInline = !settings.isBlock();
            isEmpty = settings.isEmpty();
            isFormSubmittable = settings.isFormSubmittable();
        }

        public String getName() {
            return name;
        }

        public void setSelfClosing(boolean selfClosing) {
            this.selfClosing = selfClosing;
        }
    }

    public static class ParseSettings {
        private boolean selfClosing;
        private boolean preserveWhitespace;
        private boolean isBlock;
        private boolean isInline;
        private boolean isEmpty;
        private boolean isFormSubmittable;

        public ParseSettings(boolean selfClosing, boolean preserveWhitespace) {
            this.selfClosing = selfClosing;
            this.preserveWhitespace = preserveWhitespace;
            this.isBlock = true;
            this.isInline = false;
            this.isEmpty = false;
            this.isFormSubmittable = false;
        }

        public void setSelfClosing(boolean selfClosing) {
            this.selfClosing = selfClosing;
        }

        public boolean isSelfClosing() {
            return selfClosing;
        }
    }

    @Test
    public void testTagSetSelfClosing() throws Exception {
        Document document = Jsoup.parse("<tag>text</tag>");
        Element tagElement = document.selectFirst("tag");
        ParseSettings settings = new ParseSettings(true, true);
        Tag tag = new Tag(tagElement.tagName(), settings);
        assert !tag.isFormSubmittable();
    }

}