package org.jsoup.parser;

public class GeneratedTestNormalName {

    @Test
    public void testNormalName() {
        Mockito.when(tag.normalName()).thenCallRealMethod();
        String tagName = "div";
        Mockito.when(tag.getName()).thenReturn(tagName);
        Assertions.assertEquals(tagName.toLowerCase(), tag.normalName());
    }

}