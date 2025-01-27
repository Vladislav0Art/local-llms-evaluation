package org.jsoup.parser;

public class GeneratedGetName {

    public static class ParseSettings {
        private boolean allowSelfClosing;
        private boolean allowFormSubmission;

        public ParseSettings(boolean allowSelfClosing, boolean allowFormSubmission) {
            this.allowSelfClosing = allowSelfClosing;
            this.allowFormSubmission = allowFormSubmission;
        }
    }

    @Test
    public void getName() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        Assert.assertEquals(tagName, tag.getName());
    }

}