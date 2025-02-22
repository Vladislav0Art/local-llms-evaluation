package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void setUp() {
        private Tag tag;

        @BeforeAll
        public void setUp () {
            tag = Mockito.mock(Tag.class);
        }

        @Test
        public void testGetName () {
            Mockito.when(tag.getName()).thenReturn("div");
            Assertions.assertEquals("div", tag.getName());
        }

        @Test
        public void testNormalName () {
            Mockito.when(tag.normalName()).thenCallRealMethod();
            String tagName = "div";
            Mockito.when(tag.getName()).thenReturn(tagName);
            Assertions.assertEquals(tagName.toLowerCase(), tag.normalName());
        }

        @Test
        public void testIsBlock () {
            Mockito.when(tag.isBlock()).thenCallRealMethod();
            Mockito.when(tag.isBlock).thenReturn(true);
            Assertions.assertTrue(tag.isBlock());
        }

        @Test
        public void testFormatAsBlock () {
            Mockito.when(tag.formatAsBlock()).thenCallRealMethod();
            Mockito.when(tag.formatAsBlock).thenReturn(true);
            Assertions.assertTrue(tag.formatAsBlock());
        }

        @Test
        public void testIsEmpty () {
            Mockito.when(tag.isEmpty()).thenCallRealMethod();
            Mockito.when(tag.empty).thenReturn(true);
            Assertions.assertTrue(tag.isEmpty());
        }

    }