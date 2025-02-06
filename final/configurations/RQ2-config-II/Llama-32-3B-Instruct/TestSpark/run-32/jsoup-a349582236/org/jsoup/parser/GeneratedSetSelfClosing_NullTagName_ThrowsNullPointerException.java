package org.jsoup.parser;

public class GeneratedSetSelfClosing_NullTagName_ThrowsNullPointerException {

    @Test
    public void setSelfClosing_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().setSelfClosing());
    }

}