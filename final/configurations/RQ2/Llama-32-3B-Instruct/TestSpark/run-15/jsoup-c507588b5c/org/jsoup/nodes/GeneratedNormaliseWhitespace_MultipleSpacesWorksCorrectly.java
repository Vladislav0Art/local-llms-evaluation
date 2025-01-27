package org.jsoup.nodes;

public class GeneratedNormaliseWhitespace_MultipleSpacesWorksCorrectly {

    @Test
    public void normaliseWhitespace_MultipleSpacesWorksCorrectly() {
        // Arrange & Act
        String result = StringUtil.normaliseWhitespace("   ");

        // Assert
        assertEquals("", result);
    }

}