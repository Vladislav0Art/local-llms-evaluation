package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_mocked {

    @Test
    public void outerHtmlTail_mocked() {
        // Mocking for testing purposes only. Do not use in production code.
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        when(accum).toString().thenAnswer(invocation -> invocation.getArguments()[0]);
        when(out).setDepth(depth).thenReturn(depth);
        when(accum).pushspace().thenAnswer(invocation -> invocation.getArguments()[1]);
        when(accum).pushnewline().thenAnswer(invocation -> invocation.getArguments()[1]);
        when(accum).toString().thenAnswer(invocation -> invocation.getArguments()[0]);
        TextNode node = new TextNode("Hello World");
        assertEquals("", node.outerHtmlTail(accum, depth, out));
    }

}