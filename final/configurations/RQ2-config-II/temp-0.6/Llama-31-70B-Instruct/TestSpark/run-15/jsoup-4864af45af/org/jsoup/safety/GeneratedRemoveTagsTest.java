package org.jsoup.safety;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        String[] tags = {"div", "p"};
        safelist.removeTags(tags);
        Assert.assertFalse(safelist.isSafeTag(tags[0]));
    }

}