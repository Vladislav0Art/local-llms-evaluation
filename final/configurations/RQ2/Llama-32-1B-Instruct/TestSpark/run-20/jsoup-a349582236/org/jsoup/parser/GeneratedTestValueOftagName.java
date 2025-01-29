package org.jsoup.parser;

public class GeneratedTestValueOftagName {

    @Test
    public void testValueOftagName() {
        String expected = "<div>";
        org.jsoup(parser).Normalizer.normalize("UTF-8", expected);
        Map<String, Object> map = new HashMap<>();
        map.put("tagName", "div");
        assert org.jsoup.parser.Tag.valueOf("").equals(expected) : "Test failed";
    }

}