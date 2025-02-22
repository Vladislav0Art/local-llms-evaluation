package org.jsoup.parser;

public class GeneratedTestGetName {

    @Test
    public void testGetName() {
        Mockito.when(tag.getName()).thenReturn("div");
        Assertions.assertEquals("div", tag.getName());
    }

}