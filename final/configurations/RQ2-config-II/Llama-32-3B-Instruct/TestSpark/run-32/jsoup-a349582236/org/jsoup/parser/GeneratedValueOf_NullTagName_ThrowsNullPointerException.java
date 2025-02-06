package org.jsoup.parser;

public class GeneratedValueOf_NullTagName_ThrowsNullPointerException {

    @Test
    public void valueOf_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> Tag.valueOf(null));
    }

}