package org.jsoup.safety;

public class GeneratedTestRemoveAllTags {

    @Test
    public void testRemoveAllTags() {
        Safelist safelist = new Safelist();
        safelist.addTags("img", "script");
        safelist.removeAllTags();
        assertEquals(0, safelist.safeTags.size());
    }
}

public class Safelist {
    private Set<String> safeTags;

    public Safelist() {
        this.safeTags = new HashSet<>();
    }

    public void addTag(String tag) {
        safeTags.add(tag);
    }

    public void removeTag(String tag) {
        safeTags.remove(tag);
    }

    public boolean isSafeTag(String tag) {
        return safeTags.contains(tag);
    }

    public int getSafeTagCount() {
        return safeTags.size();
    }

    public void addTags(String... tags) {
        for (String tag : tags) {
            addTag(tag);
        }
    }

    public void removeAllTags() {
        safeTags.clear();
    }

}