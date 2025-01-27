package org.jsoup.safety;

public class GeneratedBasic_AddTagsToBasicSafelist {

    @Test
    public void basic_AddTagsToBasicSafelist() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        Set<String> tags = safelist.getTags();
        Set<String> expectedTags = new HashSet<>(Arrays.asList("tag1", "tag2"));
        Assert.assertEquals(expectedTags, tags);
    }

}