package org.jsoup.parser;

public class GeneratedIsFormSubmittableEmptyStringReturnsFalse {

    @Test
    public void isFormSubmittableEmptyStringReturnsFalse() {
        Assert.assertFalse(Tag.valueOf("").isFormSubmittable());
    }

}