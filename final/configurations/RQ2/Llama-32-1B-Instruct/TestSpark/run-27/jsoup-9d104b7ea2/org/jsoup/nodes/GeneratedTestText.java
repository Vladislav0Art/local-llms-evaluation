package org.jsoup.nodes;

public class GeneratedTestText {

    private static Mockito mock;

    @Test
    public void testText() {
        String expected = "This is a sample text.";
        String text = "This is a sample text.";
        when(text()).thenReturn(expected);
        assertEquals(text, getText().text());
    }

}