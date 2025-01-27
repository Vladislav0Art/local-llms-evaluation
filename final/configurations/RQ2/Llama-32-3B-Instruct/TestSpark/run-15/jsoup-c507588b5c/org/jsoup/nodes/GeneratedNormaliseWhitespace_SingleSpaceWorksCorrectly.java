package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_SingleSpaceWorksCorrectly {

    @Test
    public void normaliseWhitespace_SingleSpaceWorksCorrectly() {
        // Arrange & Act
        String result = StringUtil.normaliseWhitespace(" ");

        // Assert
        assertEquals("", result);
    }

}