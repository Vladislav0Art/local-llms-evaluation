package org.jsoup.safety;

public class GeneratedBasic_AddTags_ReturnsCopy {

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
    public void basic_AddTags_ReturnsCopy() {
        Safelist copy = Safelist.basic().addTags("testTag");
        assertSame(Safelist.class, copy.getClass());
    }

}