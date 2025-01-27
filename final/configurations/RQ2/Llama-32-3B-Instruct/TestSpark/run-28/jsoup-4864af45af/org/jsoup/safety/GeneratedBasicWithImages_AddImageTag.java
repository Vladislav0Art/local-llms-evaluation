package org.jsoup.safety;

public class GeneratedBasicWithImages_AddImageTag {

    @Test
    public void basicWithImages_AddImageTag() {
        Safelist safelist = Safelist.basicWithImages();
        safelist.addTags("img");
        Set<String> tags = safelist.getTags();
        Set<String> expectedTags = new HashSet<>(Arrays.asList("img"));
        Assert.assertEquals(expectedTags, tags);
    }

}