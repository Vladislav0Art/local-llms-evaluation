package org.jsoup.parser;

public class GeneratedNormalName_InvalidTagName_ThrowsException {

    @Test
    public void normalName_InvalidTagName_ThrowsException() {
        String invalidName = "invalid-tag";
        assertThrows(InvalidArgumentException.class, () -> new Tag().normalName(invalidName));
    }

}