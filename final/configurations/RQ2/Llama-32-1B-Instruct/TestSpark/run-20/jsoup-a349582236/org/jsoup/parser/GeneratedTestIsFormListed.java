package org.jsoup.parser;

public class GeneratedTestIsFormListed {

    @Test
    public void testIsFormListed() {
        String expected = "<form>";
        Map<String, Object> map = new HashMap<>();
        boolean result = org.jsoup(parser).Tag.isFormListed(map);
        assert result == true : "Test failed";
    }

}