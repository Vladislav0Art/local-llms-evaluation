package org.jsoup.parser;

public class GeneratedIsSelfClosing_NullTagName_ThrowsNullPointerException {

    @Test
    public void isSelfClosing_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().isSelfClosing());
    }

}