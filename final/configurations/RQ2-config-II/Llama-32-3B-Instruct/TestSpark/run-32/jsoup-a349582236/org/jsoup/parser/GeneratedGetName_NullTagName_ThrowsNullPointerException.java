package org.jsoup.parser;

public class GeneratedGetName_NullTagName_ThrowsNullPointerException {

    @Test
    public void getName_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().getName());
    }

}