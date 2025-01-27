package org.jsoup.safety;

public class GeneratedRelaxed_AddRelaxedTags {

    @Test
    public void relaxed_AddRelaxedTags() {
        Safelist safelist = Safelist.relaxed();
        safelist.addTags("a", "b");
        Set<String> tags = safelist.getTags();
        Set<String> expectedTags = new HashSet<>(Arrays.asList("a", "b"));
        Assert.assertEquals(expectedTags, tags);
    }

}