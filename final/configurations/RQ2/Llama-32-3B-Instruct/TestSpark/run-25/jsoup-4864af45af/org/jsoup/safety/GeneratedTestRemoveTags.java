package org.jsoup.safety;

public class GeneratedTestRemoveTags {

    private static final Set<String> safeTags = new HashSet<>();

    static {
        // Define which tags are considered safe in the format "tag1 tag2"
        safeTags.add("img a");
    }

    public String getName() {
        return "Safelist";
    }

    public boolean isSafeTag(String tag) {
        if (safeTags.contains(tag)) {
            return true;
        }
        return false;
    }

    public Safelist addTags(String... tags) {
        // Implement logic to add tags
        safeTags.addAll(Arrays.asList(tags));
        return this;
    }

    public Safelist removeTags(String... tags) {
        // Implement logic to remove tags
        safeTags.removeAll(Arrays.asList(tags));
        return this;
    }
}

public class SafelistTest {

    @Test
    public void testRemoveTags() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        safelist.removeTags("tag1");
        assertFalse(safelist.isSafeTag("tag1"));
    }
}

public class Main {

    public static void main(String[] args) {
        testSafelist();
        testAddTags();
        testRemoveTags();
    }

    public static void testSafelist() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

    public static void testAddTags() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        // Verify that the tags were added correctly
    }

    public static void testRemoveTags() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        safelist.removeTags("tag1");
        assertFalse(safelist.isSafeTag("tag1"));
    }

}