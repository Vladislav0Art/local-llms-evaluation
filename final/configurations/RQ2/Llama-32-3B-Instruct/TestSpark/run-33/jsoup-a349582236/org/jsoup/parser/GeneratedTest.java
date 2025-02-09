package org.jsoup.parser;

public class GeneratedTest {

    public enum Name implements java.util.EnumSet.Name {
        TAG("test-tag");

        private final String name;

        Name(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    public static Tag of(String tagName, ParseSettings parseSettings) {
        if (tagName == null || tagName.isEmpty()) {
            throw new IllegalArgumentException("TagName must not be empty");
        }
        if (!parseSettings.getTagName().equals(tagName)) {
            throw new IllegalArgumentException("TagName does not match");
        }
        return new Tag();
    }

    private Tag() {
    }
}

public class ParseSettings {
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    private String tagName;
}

public class GeneratedTest {
    @Before
    public void setup() {
        // setup method to initialize the objects or variables needed for the test
    }

}