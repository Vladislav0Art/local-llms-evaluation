package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GeneratedTestRemoveEnforcedAttribute {

    @Test
    public void testRemoveEnforcedAttribute() {
        String[] args = {"img", "src", "https://example.com/image.jpg"};
        ArrayList<String> tags = new ArrayList<>();
        for (String tag : args) {
            tags.add(tag);
        }
        String expected = "img";
        assert !tagUtil.removeEnforcedAttribute(tags, expected);
    }

}