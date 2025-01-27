package org.jsoup.safety;

public class GeneratedTest {

    private Set<String> safeTags;

    public Safelist() {
        this.safeTags = new HashSet<>();
    }

    public void addTag(String tag) {
        safeTags.add(tag);
    }

    public boolean isSafeTag(String tag) {
        return safeTags.contains(tag);
    }

    public int getSafeTagCount() {
        return safeTags.size();
    }

    public void addTags(String... tags) {
        for (String tag : tags) {
            this.addTag(tag);
        }
    }

    public void removeAllTags() {
        this.safeTags.clear();
    }

    public static class GeneratedTest {

        @Test
        public void none_SimpleText() {
            Safelist safelist = Safelist.simpleText();
            assertNotNull(safelist);
        }

        @Test
        public void basic_SimpleText() {
            Safelist safelist = Safelist.simpleText();
            assertEquals(Safelist.simpleText(), Safelist.basic());
        }

        @Test
        public void basic_AddAttributes_Basic() {
            Safelist safelist = Safelist.basic();
            Attributes attributes = new Attributes();
            safelist.addAttributes("a", "href", "http://example.com");
            assertEquals(1, attributes.size());
        }

    }