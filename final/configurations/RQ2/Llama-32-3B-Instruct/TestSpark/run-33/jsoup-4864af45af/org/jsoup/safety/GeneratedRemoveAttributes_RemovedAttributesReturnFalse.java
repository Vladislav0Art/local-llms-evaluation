package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedRemoveAttributes_RemovedAttributesReturnFalse {

    @Test
    public void removeAttributes_RemovedAttributesReturnFalse() {
        Safelist result = new Safelist();
        result = result.removeAttributes("img", "alt");
        assertFalse(result.getEnforcedAttributes("img").containsKey("alt"));
    }

}