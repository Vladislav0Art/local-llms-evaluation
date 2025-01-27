package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlock_SelfClosingTag_ReturnsFalse {

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
    public void isBlock_SelfClosingTag_ReturnsFalse() {
        Document doc = Jsoup.parse("<img/>");
        Tag tag = (Tag) ((Element) doc).getTag();
        assertTrue(!tag.isSelfClosing());
    }

}