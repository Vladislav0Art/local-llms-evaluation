package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void getName_EmptyTagName_ReturnsEmptyString() {
        when(Tag.valueOf("", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("", null).getName(), is(""));
    }

    @Test
    public void normalName_SimpleTag_RetursTagName() {
        when(Tag.valueOf("p", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("p", null).normalName(), is("p"));
    }

    @Test
    public void normalName_NonSimpleTag_ReturnsNormalizedName() {
        when(Tag.valueOf("<div>", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("<div>", null).normalName(), is("div"));
    }

    @Test
    public void isBlock_AbsolventTagsAreBlocks() {
        when(Tag.valueOf("<body>", null)).thenReturn(new Tag());
        when(Tag.valueOf("<html>", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("<body>", null).isBlock(), is(true));
        assertThat(Tag.valueOf("<html>", null).isBlock(), is(true));
    }

    @Test
    public void isInline_InlineTagsAreInlines() {
        when(Tag.valueOf("<a>", null)).thenReturn(new Tag());
        when(Tag.valueOf("<span>", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("<a>", null).isInline(), is(true));
        assertThat(Tag.valueOf("<span>", null).isInline(), is(true));
    }

    @Test
    public void formatAsBlock_SelfClosingTagsAreBlocks() {
        when(Tag.valueOf("<img src='image.jpg'", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("<img src='image.jpg'", null).formatAsBlock(), is(true));
    }

    @Test
    public void isEmpty_EmptyTagName_ReturnsTrue() {
        when(Tag.valueOf("", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("", null).isEmpty(), is(true));
    }

    @Test
    public void isSelfClosing_SelfClosingTagsAreSelfClosing() {
        when(Tag.valueOf("<img src='image.jpg'", null)).thenReturn(new Tag());
        assertThat(Tag.valueOf("<img src='image.jpg'", null).isSelfClosing(), is(true));
    }

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