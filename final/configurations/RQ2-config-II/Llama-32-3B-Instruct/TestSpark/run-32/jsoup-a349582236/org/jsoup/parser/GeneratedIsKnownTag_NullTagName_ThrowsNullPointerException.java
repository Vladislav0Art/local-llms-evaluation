package org.jsoup.parser;

public class GeneratedIsKnownTag_NullTagName_ThrowsNullPointerException {

    @Test
    public void isKnownTag_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> Tag.isKnownTag(null));
    }

}