package org.jsoup.parser;

public class GeneratedIsEmpty_NullTagName_ThrowsNullPointerException {

    @Test
    public void isEmpty_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().isEmpty());
    }

}