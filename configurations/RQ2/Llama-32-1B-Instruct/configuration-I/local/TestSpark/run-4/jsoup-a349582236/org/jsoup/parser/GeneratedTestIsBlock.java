package org.jsoup.parser;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestIsBlock {

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
    public void testIsBlock() {
        assertTrue(tag.isBlock());
        verify(mockParser).getMock(Tag.class).isBlock();
    }

}