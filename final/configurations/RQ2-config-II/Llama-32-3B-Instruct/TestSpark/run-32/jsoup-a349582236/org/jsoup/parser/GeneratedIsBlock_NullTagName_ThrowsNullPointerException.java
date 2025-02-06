package org.jsoup.parser;

public class GeneratedIsBlock_NullTagName_ThrowsNullPointerException {

    @Test
    public void isBlock_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().isBlock());
    }

}