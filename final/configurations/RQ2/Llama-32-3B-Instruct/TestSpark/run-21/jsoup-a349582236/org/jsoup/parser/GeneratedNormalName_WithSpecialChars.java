package org.jsoup.parser;

public class GeneratedNormalName_WithSpecialChars {

    public static class ParseSettings {
        private boolean allowSelfClosing;
        private boolean allowFormSubmission;

        public ParseSettings(boolean allowSelfClosing, boolean allowFormSubmission) {
            this.allowSelfClosing = allowSelfClosing;
            this.allowFormSubmission = allowFormSubmission;
        }
    }

    @Test
    public void normalName_WithSpecialChars() {
        String tagName = "<span>";
        Tag tag = new Tag(tagName);
        Assert.assertEquals("span", tag.normalName());
    }

}