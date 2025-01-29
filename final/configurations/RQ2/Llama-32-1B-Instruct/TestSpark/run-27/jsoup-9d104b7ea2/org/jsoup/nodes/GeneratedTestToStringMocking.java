package org.jsoup.nodes;

public class GeneratedTestToStringMocking {

    private static Mockito mock;

    @Test
    public void testToStringMocking() {
        Mockito mock = Mockito.mock(TextNode.class);
        when(mock.toString()).thenReturn("");
        TextNode text = new TextNode("Hello World!");
        when(text.toString()).thenReturn(mock);
        assertEquals("", getText().toString());
    }

}