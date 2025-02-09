package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.mockito.Mockito;

public class GeneratedAddTags_AddedTagsNotReturnTrue {

    @Test
    public void addTags_AddedTagsNotReturnTrue() {
        Safelist result = new Safelist();
        result = result.addTags("b");
        assertFalse(result.isSafeTag("b"));
    }

}