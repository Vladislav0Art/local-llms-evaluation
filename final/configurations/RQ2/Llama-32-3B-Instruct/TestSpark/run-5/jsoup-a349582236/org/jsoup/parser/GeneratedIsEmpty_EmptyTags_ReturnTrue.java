package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmpty_EmptyTags_ReturnTrue {

    private static final Map<String, Boolean> selfClosingTags = new HashMap<>();

    static {
        selfClosingTags.put("area", true);
        // ... other self-closing tags ...
    }

    public String getName() {
        return this.tagName();
    }

    public boolean isSelfClosing() {
        return selfClosingTags.containsKey(tagName());
    }

    @Override
    public boolean isEmpty() {
        return tagName().isEmpty();
    }
}

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert .*;

public class TagTest {

    @Test
    public void isEmpty_EmptyTags_ReturnTrue() {
        Tag tag = new Tag("<tag></tag>");
        assertTrue(tag.isEmpty());
    }

}