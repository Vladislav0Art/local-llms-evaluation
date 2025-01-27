package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;

import static org.mockito.Mockito.when;

public class GeneratedPreserveRelativeLinks_PreservingLinksWorksCorrectly {

    @Test
    public void preserveRelativeLinks_PreservingLinksWorksCorrectly() {
        when(Safelist.class.preserveRelativeLinks(true)).thenReturn(true);
        Safelist safeList = Safelist.relaxed();
        assertTrue(safeList.preserveRelativeLinks(true));
    }

}