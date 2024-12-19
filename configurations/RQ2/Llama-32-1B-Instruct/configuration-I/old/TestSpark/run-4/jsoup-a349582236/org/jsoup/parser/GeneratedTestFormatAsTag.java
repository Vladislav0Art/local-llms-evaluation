package org.jsoup.parser;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestFormatAsTag {

    @Override
    public String getName() {
        return "TagImpl";
    }

    @Override
    public String normalName() {
        return "tag_name_1";
    }
}

class TagTest {

    private Mockito mockParser;
    private Tag tag;

    public void setupMockParser(Mockito mockParser) {
        this.mockParser = mockParser;
    }

    @Test
    public void testFormatAsTag() {
        String actualResult = tag.formatAsTag("test");
        assertEquals("tag_name_1", actualResult);
    }
}

public class TagImplementation {

    public boolean isBlock() {
        return true;
    }

    public String formatAsTag(String input) {
        return "tag_name_1";
    }

}