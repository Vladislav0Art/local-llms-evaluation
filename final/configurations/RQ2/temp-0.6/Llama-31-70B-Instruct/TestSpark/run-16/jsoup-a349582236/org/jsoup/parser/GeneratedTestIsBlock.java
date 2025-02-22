package org.jsoup.parser;

public class GeneratedTestIsBlock {

    @Test
    public void testIsBlock() {
        Mockito.when(tag.isBlock()).thenCallRealMethod();
        Mockito.when(tag.isBlock).thenReturn(true);
        Assertions.assertTrue(tag.isBlock());
    }

}