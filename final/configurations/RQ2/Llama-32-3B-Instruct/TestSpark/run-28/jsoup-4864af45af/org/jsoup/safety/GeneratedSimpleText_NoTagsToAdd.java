package org.jsoup.safety;

public class GeneratedSimpleText_NoTagsToAdd {

    @Test
    public void simpleText_NoTagsToAdd() {
        Safelist safelist = Safelist.simpleText();
        Set<String> tags = safelist.getTags();
        Assert.assertTrue(tags.isEmpty());
    }

}