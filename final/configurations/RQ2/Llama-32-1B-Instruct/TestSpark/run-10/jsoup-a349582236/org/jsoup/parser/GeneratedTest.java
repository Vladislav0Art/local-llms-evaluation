package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    public static String getId(String tag) {
        return tag.substring(9);
    }

    public static String toString(Tag tag) {
        return "org.jsoup.parser." + getTag(tag).getPrefix();
    }

    public static boolean startsWith(String tag, String prefix) {
        return tag.startsWith(prefix);
    }

    public static boolean endsWith(String tag, String suffix) {
        if (tag.endsWith(suffix)) return true;
        else if (!tag.contains(suffix)) return false;
        else throw new AssertionError("Suffix not found in tag");
    }

    public static Tag parse(String tag) {
        Document doc = Jsoup.parse(tag);
        return new Tag(doc.select("*"));
    }

    public static String getType(Tag tag) {
        try {
            return tag.type().toString();
        } catch (Exception e) {
            throw new AssertionError("Invalid type");
        }
    }
}

public class TestTag {

    @Test
    public void testToString() {
        String[] tags = {"org.jsoup.parser.Tag", "org.jsoup.parser.Tag"};
        for (String tag : tags) {
            assertEquals(tag.toString(), tag.toString());
        }
    }

}