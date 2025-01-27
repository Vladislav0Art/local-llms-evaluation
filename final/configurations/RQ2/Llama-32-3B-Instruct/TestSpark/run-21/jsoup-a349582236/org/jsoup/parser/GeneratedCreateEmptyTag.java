package org.jsoup.parser;

public class GeneratedCreateEmptyTag {

    public static class ParseSettings {
        private boolean allowSelfClosing;
        private boolean allowFormSubmission;

        public ParseSettings(boolean allowSelfClosing, boolean allowFormSubmission) {
            this.allowSelfClosing = allowSelfClosing;
            this.allowFormSubmission = allowFormSubmission;
        }
    }

    @Test
    public void createEmptyTag() {
        String tagName = "";
        Tag tag = new Tag(tagName);
        Assert.assertNotNull(tag);
        Assert.assertEquals("", tag.getName());
    }
}

public class Tag {
    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFormListable() {
        // implement logic to check if the tag is form listable
        // for simplicity, assume all input tags are form listable
        return "input".equals(this.name);
    }

    public static Tag[] of(String tagName, ParseSettings settings) {
        // implement logic to parse the tag name and create a tag array
        // for simplicity, just return an empty tag array
        return new Tag[0];
    }

}