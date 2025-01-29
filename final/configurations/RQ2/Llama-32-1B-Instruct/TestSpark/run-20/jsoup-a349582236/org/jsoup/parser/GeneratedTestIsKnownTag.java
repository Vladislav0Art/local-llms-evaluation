package org.jsoup.parser;

public class GeneratedTestIsKnownTag {

    @Test
    public void testIsKnownTag() {
        String expected = "<html>";
        Map<String, Object> map = new HashMap<>();
        boolean result = org.jsoup(parser).isKnownTag("html");
        assert result == true : "Test failed";
    }

}