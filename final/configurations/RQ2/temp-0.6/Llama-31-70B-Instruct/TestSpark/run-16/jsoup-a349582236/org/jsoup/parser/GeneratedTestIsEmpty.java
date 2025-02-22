package org.jsoup.parser;

public class GeneratedTestIsEmpty {

    @Test
    public void testIsEmpty() {
        Mockito.when(tag.isEmpty()).thenCallRealMethod();
        Mockito.when(tag.empty).thenReturn(true);
        Assertions.assertTrue(tag.isEmpty());
    }

}