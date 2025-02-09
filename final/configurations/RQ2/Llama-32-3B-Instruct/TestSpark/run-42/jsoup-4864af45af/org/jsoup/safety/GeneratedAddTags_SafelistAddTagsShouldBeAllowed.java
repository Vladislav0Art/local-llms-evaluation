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
public class GeneratedAddTags_SafelistAddTagsShouldBeAllowed {

    @BeforeClass
    public static void setup() {
        // Initialize mocks here if needed
    }

    @Test
    public void addTags_SafelistAddTagsShouldBeAllowed() {
        Safelist safelist = Safelist.none();
        Set<String> tags = new HashSet<>();
        safelist.addTags(tags.toArray(new String[0]));
        assertTrue(safelist.isSafeTag("tag"));
    }

}