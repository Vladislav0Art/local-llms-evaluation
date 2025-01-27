package org.jsoup.parser;

public class GeneratedIsFormListable {

    public static class ParseSettings {
        private boolean allowSelfClosing;
        private boolean allowFormSubmission;

        public ParseSettings(boolean allowSelfClosing, boolean allowFormSubmission) {
            this.allowSelfClosing = allowSelfClosing;
            this.allowFormSubmission = allowFormSubmission;
        }
    }

    @Test
    public void isFormListable() {
        String tagName = "input";
        Tag tag = new Tag(tagName);
        if (tag != null) {
            Assert.assertTrue(tag.isFormListable());
        }
    }

}