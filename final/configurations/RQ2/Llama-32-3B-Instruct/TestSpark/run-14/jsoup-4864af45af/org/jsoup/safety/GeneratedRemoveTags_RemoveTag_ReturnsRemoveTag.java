package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedRemoveTags_RemoveTag_ReturnsRemoveTag {

    @Test
    public void removeTags_RemoveTag_ReturnsRemoveTag() {
        Safelist result = Safelist.removeTags("b");
        assertFalse(result.getSafeTags().contains("b"));
    }

}