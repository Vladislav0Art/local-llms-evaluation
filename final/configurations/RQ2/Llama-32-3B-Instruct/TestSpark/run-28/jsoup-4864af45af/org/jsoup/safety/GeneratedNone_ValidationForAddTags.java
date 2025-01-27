package org.jsoup.safety;

public class GeneratedNone_ValidationForAddTags {

    @Test
    public void none_ValidationForAddTags() {
        Validate.expectingAssertionError(() -> Safelist.none().addTags("tag1"));
    }

}