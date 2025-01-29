package org.jsoup.nodes;

public class GeneratedTestnodeName {

    private static Mockito mock;

    @Test
    public void testnodeName() {
        String expected = "text";
        String text = "Hello World!";
        when(nodeName()).thenReturn(expected);
        assertEquals("text", getText().nodeName());
    }

}