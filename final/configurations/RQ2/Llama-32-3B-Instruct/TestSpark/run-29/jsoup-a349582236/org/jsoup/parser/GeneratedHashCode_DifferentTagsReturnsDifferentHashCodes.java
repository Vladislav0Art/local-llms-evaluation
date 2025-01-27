package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedHashCode_DifferentTagsReturnsDifferentHashCodes {

    @Test
    public void hashCode_DifferentTagsReturnsDifferentHashCodes() {
        Tag tag1 = Tag.valueOf("<div>");
        Tag tag2 = Tag.valueOf("<span>");
        assertNotEquals(tag1.hashCode(), tag2.hashCode());
    }
}

class Tag {
    private boolean selfClosing;

    public boolean setSelfClosing() {
        return this.selfClosing = false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Tag tag = (Tag) obj;
        return selfClosing == tag.selfClosing;
    }

}