package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedRemoveTags_removalOfTagsDoesNotNullify {

    @Test
    public void removeTags_removalOfTagsDoesNotNullify() {
        Safelist safelist = Safelist.addTags("img").removeTags("img");
        assertNotNull(safelist);
        assertFalse(safelist.isSafeTag("img"));
    }

}