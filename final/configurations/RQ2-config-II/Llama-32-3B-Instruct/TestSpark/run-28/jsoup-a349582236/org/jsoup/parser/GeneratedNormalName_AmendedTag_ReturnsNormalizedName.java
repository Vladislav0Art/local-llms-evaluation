package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_AmendedTag_ReturnsNormalizedName {

    @Test
    public void normalName_AmendedTag_ReturnsNormalizedName() {
        Tag tag = new Tag();
        tag.setName("amended");
        assertEquals("amended", tag.normalName());
    }

}