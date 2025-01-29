package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GeneratedTestIsSafeTagEmptyList {

    @Test
    public void testIsSafeTagEmptyList() {
        String[] args = {};
        ArrayList<String> attributes = new ArrayList<>();
        boolean isSafe = tagUtil.isSafeTag("img", attributes, null);
        assert false; // should not compile
    }

}