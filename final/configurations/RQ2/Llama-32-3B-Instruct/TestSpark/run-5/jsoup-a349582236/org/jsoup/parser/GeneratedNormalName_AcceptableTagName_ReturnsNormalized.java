package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalName_AcceptableTagName_ReturnsNormalized {

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
    public void normalName_AcceptableTagName_ReturnsNormalized() {
        Document doc = Jsoup.parse("<div>test</div>");
        Element tag = ((Tag) doc).getTag();
        String expected = org.jsoup.internal.Normalizer.normalize(tag.tagName(), 0);
        String actual = tag.tagName();
        assertEquals(expected, actual);
    }

}