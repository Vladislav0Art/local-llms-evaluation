package org.jsoup.parser;

public class GeneratedIsFormListedEmptyStringReturnsFalse {

    @Test
    public void isFormListedEmptyStringReturnsFalse() {
        Assert.assertFalse(Tag.valueOf("").isFormListed());
    }

}