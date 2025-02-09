package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_NormalisationIsCorrect {

    @Test
    public void normaliseWhitespace_NormalisationIsCorrect() {
        String expected = "text";
        assertEquals(expected, StringUtil.normaliseWhitespace(expected));
    }

}