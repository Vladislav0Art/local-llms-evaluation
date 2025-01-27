package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedPreserveRelativeLinks_PreserveLinks {

    @Test
    public void preserveRelativeLinks_PreserveLinks() {
        Safelist safelist = Safelist.relaxed();
        boolean preserve = true;
        Safelist updatedSafelist = safelist.preserveRelativeLinks(preserve);
        assertTrue(updatedSafelist.preserveRelativeLinks());
    }

}