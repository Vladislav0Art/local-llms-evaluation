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
public class GeneratedPreserveRelativeLinks_SafelistPreserveRelativeLinksShouldBeAllowed {

    @BeforeClass
    public static void setup() {
        // Initialize mocks here if needed
    }

    @Test
    public void preserveRelativeLinks_SafelistPreserveRelativeLinksShouldBeAllowed() {
        Safelist safelist = Safelist.relaxed();
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag("a"));
    }

}