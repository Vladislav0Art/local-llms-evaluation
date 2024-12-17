package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testRegisterTag() {
        // Test the register method of Tag class.
        String tagName = "div";
        Tag tag = new Main().createTag(tagName);
        Validate.notNull(tag);
        System.out.println("tag is not null: " + (tag != null ? "true" : "false"));
    }

    @Test
    public void testCreateTag() {
        // Test the createTag method of Tag class.
        String tagName = "span";
        Tag tag = new Main().createTag(tagName);
        Validate.notNull(tag);

        System.out.println("tag has tag name: " + tag.tagName);

        // Check if 'tagName' is empty or not
        System.out.println("Is tag name empty? " + (tag.tagName.isEmpty() ? "true" : "false"));
    }

    @Test
    public void testRegisterEmptyTag() {
        // Test the register method of Tag class when the tag name is empty.
        String tagName = "";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testRegisterFormatAsInlineTags() {
        // Test the register method of Tag class when the tag name is one of formatAsInlineTags.
        String tagName = "title";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testRegisterEmptyFormatAsInlineTags() {
        // Test the register method of Tag class when the tag name is one of formatAsInlineTags and empty.
        String tagName = "a";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testRegisterFormatAsBlockTags() {
        // Test the register method of Tag class when the tag name is one of formatAsBlockTags.
        String tagName = "script";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testRegisterEmptyFormatAsBlockTags() {
        // Test the register method of Tag class when the tag name is one of formatAsBlockTags and empty.
        String tagName = "span";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testRegisterFormListedTags() {
        // Test the register method of Tag class when the tag name is one of formListedTags.
        String tagName = "button";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testRegisterEmptyFormListedTags() {
        // Test the register method of Tag class when the tag name is one of formListedTags and empty.
        String tagName = "li";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testRegisterFormSubmitTags() {
        // Test the register method of Tag class when the tag name is one of formSubmitTags.
        String tagName = "input";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testRegisterEmptyFormSubmitTags() {
        // Test the register method of Tag class when the tag name is one of formSubmitTags and empty.
        String tagName = "div";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testValidateNotNoneTag() {
        // Test the Validate.notNull method of Tag class.
        String tagName = "span";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testValidateTagName() {
        // Test the Validate.notNull method of Tag class.
        String tagName = null;
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testCreateTag() {
        // Test the createTag method of Tag class.
        String tagName = "span";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testCreateTagEmptyTagName() {
        // Test the createTag method of Tag class when the tag name is empty.
        String tagName = "";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testCreateTagFormatAsInlineTags() {
        // Test the createTag method of Tag class when the tag name is one of formatAsInlineTags.
        String tagName = "title";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testCreateTagEmptyFormatAsInlineTags() {
        // Test the createTag method of Tag class when the tag name is one of formatAsInlineTags and empty.
        String tagName = "span";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testCreateTagFormatAsBlockTags() {
        // Test the createTag method of Tag class when the tag name is one of formatAsBlockTags.
        String tagName = "script";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testCreateTagEmptyFormatAsBlockTags() {
        // Test the createTag method of Tag class when the tag name is one of formatAsBlockTags and empty.
        String tagName = "span";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testCreateTagFormListedTags() {
        // Test the createTag method of Tag class when the tag name is one of formListedTags.
        String tagName = "button";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testCreateTagEmptyFormListedTags() {
        // Test the createTag method of Tag class when the tag name is one of formListedTags and empty.
        String tagName = "li";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testCreateTagFormSubmitTags() {
        // Test the createTag method of Tag class when the tag name is one of formSubmitTags.
        String tagName = "input";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testCreateTagEmptyFormSubmitTags() {
        // Test the createTag method of Tag class when the tag name is one of formSubmitTags and empty.
        String tagName = "div";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}