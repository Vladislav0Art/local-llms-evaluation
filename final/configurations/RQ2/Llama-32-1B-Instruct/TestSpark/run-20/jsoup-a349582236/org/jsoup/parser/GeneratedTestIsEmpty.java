package org.jsoup.parser;

public class GeneratedTestIsEmpty {

    @Test
    public void testIsEmpty() {
        String expected = "<html></html>";
        org.jsoup(parser).Normalizer.normalize("UTF-8", expected);
        Map<String, Object> map = new HashMap<>();
        assert org.jsoup.parser.Tag.isEmpty(map) == true : "Test failed";
    }

}