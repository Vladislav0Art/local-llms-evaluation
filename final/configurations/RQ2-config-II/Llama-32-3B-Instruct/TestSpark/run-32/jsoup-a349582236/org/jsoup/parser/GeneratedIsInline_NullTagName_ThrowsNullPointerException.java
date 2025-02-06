package org.jsoup.parser;

public class GeneratedIsInline_NullTagName_ThrowsNullPointerException {

    @Test
    public void isInline_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().isInline());
    }

}