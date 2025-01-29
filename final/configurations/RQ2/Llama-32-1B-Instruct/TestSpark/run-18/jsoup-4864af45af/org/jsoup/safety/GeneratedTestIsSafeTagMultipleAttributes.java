package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GeneratedTestIsSafeTagMultipleAttributes {

    @Test
    public void testIsSafeTagMultipleAttributes() {
        String[] args = {"img", "src", "alt"};
        ArrayList<String> attributes = new ArrayList<>();
        for (String attribute : args) {
            attributes.add(attribute);
        }
        boolean isSafe = tagUtil.isSafeTag("img", attributes, null);
        assert !isSafe;
    }

}