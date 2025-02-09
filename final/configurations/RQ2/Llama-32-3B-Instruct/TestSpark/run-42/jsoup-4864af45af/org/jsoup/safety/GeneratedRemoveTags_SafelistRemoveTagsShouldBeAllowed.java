package org.jsoup.safety;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedRemoveTags_SafelistRemoveTagsShouldBeAllowed {

    @BeforeClass
    public static void setup() {
        // Initialize mocks here if needed
    }

    @Test
    public void removeTags_SafelistRemoveTagsShouldBeAllowed() {
        Safelist safelist = Safelist.none();
        Set<String> tags = new HashSet<>();
        safelist.removeTags(tags.toArray(new String[0]));
        assertFalse(safelist.isSafeTag("tag"));
    }

}