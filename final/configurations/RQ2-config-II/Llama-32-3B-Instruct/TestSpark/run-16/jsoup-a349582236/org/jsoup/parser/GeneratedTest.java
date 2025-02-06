package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void getTagNameEmptyStringReturnsNull() {
        Assert.assertNull(Tag.valueOf("").getName());
    }

    @Test
    public void getTagNameUnknownTagReturnsNull() {
        Assert.assertNull(Tag.valueOf("unknown").getName());
    }

    @Test
    public void getNameOfBlockTagIsNotNull() {
        Tag tag = Tag.valueOf("div");
        Assert.assertNotNull(tag.getName());
    }

    @Test
    public void getNameOfInlineTagIsNotNull() {
        Tag tag = Tag.valueOf("span");
        Assert.assertNotNull(tag.getName());
    }

    @Test
    public void isSelfClosingEmptyStringReturnsFalse() {
        Assert.assertFalse(Tag.valueOf("").isSelfClosing());
    }

    @Test
    public void isSelfClosingUnknownTagReturnsTrue() {
        Assert.assertTrue(Tag.valueOf("img").isSelfClosing());
    }

    @Test
    public void normalNameOfBlockTagIsNotNull() {
        Tag tag = Tag.valueOf("div");
        Assert.assertNotNull(tag.normalName());
    }

    @Test
    public void normalNameOfInlineTagIsNotNull() {
        Tag tag = Tag.valueOf("span");
        Assert.assertNotNull(tag.normalName());
    }

    @Test
    public void isBlockEmptyStringReturnsFalse() {
        Assert.assertFalse(Tag.valueOf("").isBlock());
    }

    @Test
    public void formatAsBlockUnknownTagReturnsFalse() {
        Assert.assertFalse(Tag.valueOf("img").formatAsBlock());
    }

    @Test
    public void isEmptyUnknownTagReturnsFalse() {
        Assert.assertFalse(Tag.valueOf("input").isEmpty());
    }

    @Test
    public void isFormListedEmptyStringReturnsFalse() {
        Assert.assertFalse(Tag.valueOf("").isFormListed());
    }

    @Test
    public void isFormSubmittableEmptyStringReturnsFalse() {
        Assert.assertFalse(Tag.valueOf("").isFormSubmittable());
    }

    @Test
    public void preserveWhitespaceUnknownTagReturnsFalse() {
        Tag tag = Tag.valueOf("input");
        Assert.assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void equalsUnknownTagEqualsNullTag() {
        Tag tag1 = Tag.valueOf("input");
        Tag tag2 = Tag.valueOf("img");
        Assert.assertFalse(tag1.equals(tag2));
    }

}