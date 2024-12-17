package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

public class GeneratedTestRegisterPreserveWhitespaceTag_PreserveWhitespaceTag_FormalTag {

    public static Tag registerPreserveWhitespaceTag(String tag) {
        // Generate public class and method for Tag
        Document doc = Jsoup.parse("<html><body></body></html>");
        Tag tagTag = doc.createElement("div");
        tagTag.attr("class", "tag");

        if (tag.equals("ul")) {
            tagTag.append("ul").append(" span").append("PreserveWhitespaceTag").append("").text("");
        } else if (tag.equals("p")) {
            tagTag.append("span").append("FormedListedTag").append("").text("");
        }

        // Generate public class and method for Tag
        return new Tag(tagTag);
    }

    private static class Tag {
        String text;

        public Tag(String text) {
            this.text = text;
        }
    }

    @Test
    public void testRegisterPreserveWhitespaceTag_PreserveWhitespaceTag_FormalTag() {
        // Test to check if tag is correctly parsed when formal tag is used
        Tag tag = registerPreserveWhitespaceTag("form");
        Document doc = Jsoup.parse("<html><body>" + tag.toString() + "</body></html>");
        assert doc.select("#tag").text().equals(tag.text());
    }

}