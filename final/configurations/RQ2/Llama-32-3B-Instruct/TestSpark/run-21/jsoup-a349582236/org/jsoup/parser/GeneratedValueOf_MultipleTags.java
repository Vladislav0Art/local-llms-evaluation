package org.jsoup.parser;

public class GeneratedValueOf_MultipleTags {

    public static class ParseSettings {
        private boolean allowSelfClosing;
        private boolean allowFormSubmission;

        public ParseSettings(boolean allowSelfClosing, boolean allowFormSubmission) {
            this.allowSelfClosing = allowSelfClosing;
            this.allowFormSubmission = allowFormSubmission;
        }
    }

    @Test
    public void valueOf_MultipleTags() {
        String tagName = "div p span";
        ParseSettings settings = new ParseSettings();
        Tag[] tags = Tag.valueOf(tagName, settings);
        Assert.assertEquals(3, tags.length);
    }

}