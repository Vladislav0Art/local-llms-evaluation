package org.jsoup.safety;

public class GeneratedBasic_NoRemoveTagAfterCreation {

    @Test
    public void basic_NoRemoveTagAfterCreation() {
        Safelist safelist = Safelist.basic();
        safelist.removeTags("tag3");
        Set<String> tags = safelist.getTags();
        Set<String> expectedTags = new HashSet<>(Arrays.asList("tag1", "tag2"));
        Assert.assertEquals(expectedTags, tags);
    }

}