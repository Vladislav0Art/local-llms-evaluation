package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestGetTag {

    public static boolean isBlock(ParseSettings settings) {
        return settings.isBlock();
    }

    public static boolean isSelfClosing(ParseSettings settings) {
        return settings.isSelfClosing();
    }

    public static boolean isEmpty(ParseSettings settings) {
        return settings.isEmpty();
    }
}

import org.junit.jupiter.api.Test;

public class Tag {

    @Test
    public void testGetTag() {
        ParseSettings parseSettings = new ParseSettings(true, false);
        Tag tag = Tag.valueOf("test-tag", parseSettings);
        assertEquals("block", tag.getName());
        assertEquals("inline", tag.getNormalName());

        parseSettings = new ParseSettings(false, true);
        tag = Tag.valueOf("selfClosing", parseSettings);
        assertEquals("selfClosing", tag.getName());
        assertEquals(true, tag.getNormalName().equals("selfClosing"));

        parseSettings = new ParseSettings(true, false);
        tag = Tag.valueOf("formListed", parseSettings);
        assertEquals("formListed", tag.getName());
        assertEquals(false, tag.getNormalName().equals("formListed"));

        parseSettings = new ParseSettings();
        try {
            Tag.valueOf("unknown-tag", parseSettings);
        } catch (IllegalArgumentException e) {
            // expected
        }

        parseSettings = new ParseSettings(true, false);
        parseSettings.setBlock(new BlockTag());
        tag = Tag.valueOf("block", parseSettings);
        assertEquals("block", tag.getName());
        assertEquals(new BlockTag(), tag.getNormalName());

        parseSettings = new ParseSettings(false, true);
        parseSettings.setSelfClosing(new SelfClosingTag());
        tag = Tag.valueOf("selfClosing", parseSettings);
        assertEquals("selfClosing", tag.getName());
        assertEquals(true, tag.getNormalName().equals("selfClosing"));
    }
}

public class BlockTag extends Tag {

    public BlockTag() {
        this(false, true);
    }

    @Override
    public String getName() {
        return "block";
    }

    @Override
    public String getNormalName() {
        return getName();
    }
}

public class SelfClosingTag extends Tag {

    public SelfClosingTag() {
        this(true, true);
    }

    @Override
    public String getName() {
        return "selfClosing";
    }

    @Override
    public String getNormalName() {
        return getName();
    }
}

public class InlineTag extends Tag {

    public InlineTag() {
        this(false, false);
    }

    @Override
    public String getName() {
        return "inline";
    }

    @Override
    public String getNormalName() {
        return getName();
    }
}

public class FormedListTag extends Tag {

    public FormedListTag() {
        this(false, false);
    }

    @Override
    public String getName() {
        return "formListed";
    }

    @Override
    public String getNormalName() {
        return getName();
    }
}

public class FormSubmittedTag extends Tag {

    public FormSubmittedTag() {
        this(false, true);
    }

    @Override
    public String getName() {
        return "formSubmitted";
    }

    @Override
    public String getNormalName() {
        return getName();
    }

}