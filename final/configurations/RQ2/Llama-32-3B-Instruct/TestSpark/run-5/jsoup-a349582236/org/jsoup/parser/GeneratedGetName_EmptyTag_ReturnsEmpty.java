package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetName_EmptyTag_ReturnsEmpty {

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
    public void getName_EmptyTag_ReturnsEmpty() {
        String name = new Tag("<tag></tag>").getName();
        assertEquals("", name);
    }

}