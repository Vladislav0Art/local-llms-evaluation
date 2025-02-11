package org.jsoup.helper;

public class Generated[UrlBuilderAppendToAscii][InputValidString]

Test {

    @Test
    public void [UrlBuilderAppendToAscii][InputValidString]Test() {
        StringBuilder sb = new StringBuilder();
        assertSame("", UrlBuilder.appendToAscii("Hello World", false, sb));
        assertEquals("%20Hello%20World", UrlBuilder.appendToAscii("Hello World", true, sb).toString());
    }

}