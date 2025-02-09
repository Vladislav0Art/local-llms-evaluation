package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedRemoveTags_RemovedTagsReturnFalse {

    @Test
    public void removeTags_RemovedTagsReturnFalse() {
        Safelist result = new Safelist();
        result = result.removeTags("p", "img");
        assertFalse(result.isSafeTag("p"));
        assertFalse(result.isSafeTag("img"));
    }

}