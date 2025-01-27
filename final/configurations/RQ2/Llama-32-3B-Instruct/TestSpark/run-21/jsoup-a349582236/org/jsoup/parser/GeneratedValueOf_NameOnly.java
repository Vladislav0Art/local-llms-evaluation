package org.jsoup.parser;

public class GeneratedValueOf_NameOnly {

    public static class ParseSettings {
        private boolean allowSelfClosing;
        private boolean allowFormSubmission;

        public ParseSettings(boolean allowSelfClosing, boolean allowFormSubmission) {
            this.allowSelfClosing = allowSelfClosing;
            this.allowFormSubmission = allowFormSubmission;
        }
    }

    @Test
    public void valueOf_NameOnly() {
        String tagName = "p";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        if (tag != null) {
            Assert.assertNotNull(tag);
        }
    }

}