package org.jsoup.parser;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestGetKnownTag_ {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tag)) return false;
        Tag tag = (Tag) o;
        return preserveWhitespace() == tag.preserveWhitespace();
    }

    @Override
    public int hashCode() {
        final int hash = 31;
        return hash * 31 + preserveWhitespace();
    }

    @Override
    public String toString() {
        return "TagImpl{" +
                "name='" + getName() + '\'' +
                ", normalName()=" + Normalizer.normalize(getName(), Normalizer.NFD) +
                '}';
    }
}

public class TagValueTest {

    private final Tag tag;

    public TagValueTest(Tag value) {
        this.tag = value;
    }

    @Test
    public void testGetKnownTag_() {
        assertTrue(tag.isKnownTag("form"));
    }
}

public class TagValue {

    private final String tagName;

    public TagValue(String tagName) {
        this.tagName = tagName;
    }

    public String getName() {
        return tagName;
    }

}