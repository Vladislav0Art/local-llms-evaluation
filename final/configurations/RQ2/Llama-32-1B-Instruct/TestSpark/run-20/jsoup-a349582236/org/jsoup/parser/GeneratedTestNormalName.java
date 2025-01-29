package org.jsoup.parser;

public class GeneratedTestNormalName {

    @Test
    public void testNormalName() {
        String expected = "<div>";
        org.jsoup(parser).Normalizer.normalize("UTF-8", expected);
        Map<String, Object> map = new HashMap<>();
        map.put("tagName", "div");
        assert org.jsoup.parser.Tag.normalName().equals(expected) : "Test failed";
    }

}