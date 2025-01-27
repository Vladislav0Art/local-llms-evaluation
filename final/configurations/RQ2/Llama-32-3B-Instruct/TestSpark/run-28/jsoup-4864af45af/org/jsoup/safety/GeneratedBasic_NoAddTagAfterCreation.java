package org.jsoup.safety;

public class GeneratedBasic_NoAddTagAfterCreation {

    @Test
    public void basic_NoAddTagAfterCreation() {
        Safelist safelist = Safelist.basic();
        safelist.addTags("tag3");
        Set<String> tags = safelist.getTags();
        Set<String> expectedTags = new HashSet<>(Arrays.asList("tag1", "tag2"));
        Assert.assertEquals(expectedTags, tags);
    }

}