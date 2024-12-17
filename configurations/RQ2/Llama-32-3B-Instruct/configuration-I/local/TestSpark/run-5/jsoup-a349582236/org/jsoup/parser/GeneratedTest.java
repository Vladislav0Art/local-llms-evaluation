package org.jsoup.parser;

public class GeneratedTest {

    private String name;

    public static Tag createTag(String name) {
        return new Tag(name);
    }

    public boolean isBlock() {
        // default implementation
        return false;
    }

    public boolean isInline() {
        // default implementation
        return false;
    }
}

class ParseSettings {
    private boolean knownTags;

    public ParseSettings(boolean knownTags) {
        this.knownTags = knownTags;
    }

    public static ParseSettings createParseSettings(boolean knownTags) {
        return new ParseSettings(knownTags);
    }
}

class TagTest {

}