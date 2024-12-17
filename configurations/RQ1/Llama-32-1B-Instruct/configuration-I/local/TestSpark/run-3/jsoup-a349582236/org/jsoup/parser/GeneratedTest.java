package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    private static final Map<String, Tag> tags = new HashMap<>();

    public static void register(Tag tag) {
        if (tag.tagName == null || tag.tagName.isEmpty()) {
            throw new IllegalArgumentException("Tag name cannot be empty");
        }
        tags.put(tag.tagName.toLowerCase(), tag);
    }

    @Test
    public void testRegister() {
        // Test that the tag is registered correctly
        Tag tag = new Tag("div");
        register(tag);

        Document doc = Jsoup.parse("<html><body><div id='test'></div></body></html>");
        for (Tag entry : tags.values()) {
            Element element = doc.getElementById(entry.tagName.toLowerCase());
            if (element != null) {
                System.out.println("Tag found: " + entry.getTagName() + " has tag " + entry.getTag());
            }
        }

        // Test that the map is accessible
        try {
            Document doc2 = Jsoup.parse("<html><body><div id='test2'></div></body></html>");
            for (Map.Entry<String, Tag> entry : tags.entrySet()) {
                Element element = doc2.getElementById(entry.getKey());
                if (element != null) {
                    System.out.println("Tag found: " + entry.getKey() + " has tag " + entry.getValue().getTagName());
                }
            }
        } catch (NullPointerException e) {
            System.out.println("The map is not accessible");
        }
    }

    public static class Tag {
        private String tagName;

        public Tag(String tagName) {
            this.tagName = tagName;
        }

        public String getTagName() {
            return tagName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Tag tag = (Tag) o;
            return Objects.equals(tag.tagName, this.tagName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(tagName);
        }
    }

    public static void main(String[] args) {
        register(new Tag("div"));
        register(new Tag("span"));
    }

}