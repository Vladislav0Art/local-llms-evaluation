package org.jsoup.safety;

public class GeneratedNone_Safelist {

    private Set<String> addedTags;

    @Override
    protected boolean isSafeTag(String tag) {
        return true; // Always safe
    }

    public void setAddedTags(Set<String> addedTags) {
        this.addedTags = addedTags;
    }
}

public class GeneratedTest {

    @Test
    public void none_Safelist() {
        assertSame(Safelist.none(), Safelist.none());
    }

}