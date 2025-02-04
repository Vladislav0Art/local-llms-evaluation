package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNormaliseWhitespace_AppendsToBuilder {

    @Test
    public void normaliseWhitespace_AppendsToBuilder() {
        StringBuilder builder = new StringBuilder();
        List<String> builderList = new ArrayList<>();
        builderList.add(StringUtil.normaliseWhitespace(builder.toString()));
        assertEquals(1, builderList.size());
    }

}