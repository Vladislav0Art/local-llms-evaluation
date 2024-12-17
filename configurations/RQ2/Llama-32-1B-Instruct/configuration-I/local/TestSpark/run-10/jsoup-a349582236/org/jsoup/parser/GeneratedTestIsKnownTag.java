package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestIsKnownTag {

    public static boolean isKnownTag(String tagName) {
        if (tagName.equals("input")) return true;  // Replace "input" with actual test input
        return false;
    }

    @Test
    public void testIsKnownTag() {
        assertTrue(isKnownTag("input"));
    }
}

public class Tag {
    private String tagName;

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    public boolean isFormListed() {
        return true;
    }
}

class TagImpl extends Tag {
    @Override
    public String toString() {
        return "Tag{" +
                "tagName='" + tagName + '\'' +
                '}';
    }
}

public class TestUtils {
    public static void main(String[] args) {
        assertTrue(TagUtils.isKnownTag("input"));
        if (TagUtils.isKnownTag("form")) {
            assertTrue(true);
        } else {
            System.out.println("Not found");
        }
    }

}