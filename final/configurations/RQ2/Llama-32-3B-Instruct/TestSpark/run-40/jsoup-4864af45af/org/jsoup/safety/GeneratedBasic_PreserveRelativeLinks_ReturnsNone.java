package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedBasic_PreserveRelativeLinks_ReturnsNone {

    @Test
    public void basic_PreserveRelativeLinks_ReturnsNone() {
        Safelist copy = Safelist.basic().preserveRelativeLinks(false);
        assertNotSame(Safelist.relaxed(), copy);
    }
}

public class MockSafelist extends Safelist {
    private Set<String> addedTags;

    public Set<String> getAddedTags() {
        return addedTags;
    }

    @Override
    protected boolean isSafeTag(String tag) {
        return true; // Always safe
    }

}