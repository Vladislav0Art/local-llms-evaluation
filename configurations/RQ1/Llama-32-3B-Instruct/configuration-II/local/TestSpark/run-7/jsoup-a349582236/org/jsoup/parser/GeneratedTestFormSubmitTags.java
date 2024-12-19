package org.jsoup.parser;

public class GeneratedTestFormSubmitTags {

    @Test
    public void testFormSubmitTags() {
        Tag tag = new Tag("test");
        tag.formSubmit = true;
        assertTrue(tag.formSubmit());
    }
}

}