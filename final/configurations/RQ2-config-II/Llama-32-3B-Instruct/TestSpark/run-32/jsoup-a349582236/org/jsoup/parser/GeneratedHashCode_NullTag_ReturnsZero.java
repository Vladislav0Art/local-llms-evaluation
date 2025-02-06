package org.jsoup.parser;

public class GeneratedHashCode_NullTag_ReturnsZero {

    @Test
    public void hashCode_NullTag_ReturnsZero() {
        Tag tag1 = new Tag();
        Tag tag2 = null;
        assertEquals(0, tag1.hashCode());
    }

}