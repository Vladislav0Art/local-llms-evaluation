package org.jsoup.parser;

public class GeneratedCreateTag {

    public static class ParseSettings {
        private boolean allowSelfClosing;
        private boolean allowFormSubmission;

        public ParseSettings(boolean allowSelfClosing, boolean allowFormSubmission) {
            this.allowSelfClosing = allowSelfClosing;
            this.allowFormSubmission = allowFormSubmission;
        }
    }

    @Test
    public void createTag() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        Assert.assertNotNull(tag);
        Assert.assertEquals(tagName, tag.getName());
    }

}