package org.jsoup.safety;

public class GeneratedTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        String[] tags = {"div", "p"};
        safelist.addTags(tags);
        Assert.assertTrue(safelist.isSafeTag(tags[0]));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        String[] tags = {"div", "p"};
        safelist.removeTags(tags);
        Assert.assertFalse(safelist.isSafeTag(tags[0]));
    }

}