package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestTagNameHashCode {

    @Test
    public void testTagNameHashCode() {
        String[] tags = {"img", "div"};
        Map<String, Object> map = new HashMap<>();
        map.put("img", new TagImpl("img"));
        map.put("div", new TagImpl("div"));

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            Assert.assertEquals(entry.getKey(), (String) value);
        }
    }

}