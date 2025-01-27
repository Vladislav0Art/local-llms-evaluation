package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedPreserveWhitespace_NoPreserveWhitespace_ReturnsFalse {

    @Test
    public void preserveWhitespace_NoPreserveWhitespace_ReturnsFalse() {
        Tag tag = new Tag();
        tag.setPreserveWhitespace(false);
        assertThat(tag.preserveWhitespace(), is(false));
    }
}

class Tag {
    private String name;

    public Tag() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String normalName() {
        if (name == null || name.isEmpty()) {
            return "";
        } else if (name.startsWith("<")) {
            return name.substring(1, name.length());
        } else {
            return name;
        }
    }

    public static Tag valueOf(String tagName, ParseSettings settings) {
        // Implementation
        return new Tag();
    }

    public static Tag valueOf(String tagName) {
        // Implementation
        return new Tag();
    }

    public boolean isBlock() {
        // Implementation
        return false;
    }

    public boolean formatAsBlock() {
        // Implementation
        return false;
    }

    public boolean isInline() {
        // Implementation
        return false;
    }

    public boolean isEmpty() {
        // Implementation
        return true;
    }

    public boolean isSelfClosing() {
        // Implementation
        return false;
    }

    public boolean isKnownTag() {
        // Implementation
        return true;
    }

    public static boolean isKnownTag(String tagName) {
        // Implementation
        return true;
    }

    public boolean preserveWhitespace() {
        // Implementation
        return false;
    }

    public boolean isFormListed() {
        // Implementation
        return false;
    }

    public boolean isFormSubmittable() {
        // Implementation
        return false;
    }

    public Tag setSelfClosing() {
        // Implementation
        return this;
    }

    @Override
    public boolean equals(Object o) {
        // Implementation
        return false;
    }

    @Override
    public int hashCode() {
        // Implementation
        return 0;
    }

    @Override
    protected Tag clone() {
        // Implementation
        return null;
    }

}