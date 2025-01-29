package org.jsoup.nodes;

public class GeneratedTestTextConcatenation {

    private static Mockito mock;

    @Test
    public void testTextConcatenation() {
        String expected = "Hello World!";
        String text = "This is a sample text.";
        when(text()).thenReturn(expected);
        assertEquals(text, getText().text());
    }

}