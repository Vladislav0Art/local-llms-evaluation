package org.jsoup.parser;

import org.junit.jupiter.api.Test;

public class GeneratedTestRegisterFormSubmitTag {

    private static final String[] BLOCKTags = {"ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption"};
    private static final String[] INLINETags = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd"};
    private static final String[] EMPTYTags = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command"};
    private static final String[] FORMATASINLINETags = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style"};
    private static final String[] PRESERVEWHITESPACESTags = {"pre", "plaintext", "title", "textarea"};
    private static final String[] FORMLISTEDTags = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    private static final String[] FORMSUBMITTags = {"input", "keygen", "object", "select", "textarea"};

    public static Tag register(Tag tag) {
        if (tag instanceof BlockTag || tag instanceof Inlinetag || tag instanceof EmptyTag ||
                tag instanceof FormatAsInlineTag || tag instanceof PreserveWhitespaceTag ||
                tag instanceof FormedListedTag || tag instanceof PreserveWhitespaceTag ||
                tag instanceof FormSubmitTag) {
            return new Tag(tag);
        } else {
            throw new RuntimeException("Invalid tag");
        }
    }

    @Test
    public void testRegisterFormSubmitTag() {
        Tag tag = register(new Tag("input"));
        assert !tag.isEmpty();
    }

}