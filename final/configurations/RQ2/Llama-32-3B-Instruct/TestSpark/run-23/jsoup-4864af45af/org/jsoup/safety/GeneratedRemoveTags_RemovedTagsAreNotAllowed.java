package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;

import static org.mockito.Mockito.when;

public class GeneratedRemoveTags_RemovedTagsAreNotAllowed {

    @Test
    public void removeTags_RemovedTagsAreNotAllowed() {
        Safelist safeList = Safelist.simpleText();
        when(Safelist.class.isSafeTag("removed")).thenReturn(false);
        Safelist safeList2 = safeList.removeTags("removed");
        assertFalse(safeList2.isSafeTag("removed"));
    }

}