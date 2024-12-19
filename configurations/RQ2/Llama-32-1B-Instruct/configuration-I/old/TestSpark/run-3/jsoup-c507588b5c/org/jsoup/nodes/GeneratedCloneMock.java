package org.jsoup.nodes;

public class GeneratedCloneMock {

    @Test
    public void cloneMock() throws IOException {
        Document.OutputSettings out = new DocumentOutputSettingsMock();
        TextNode textNode = new TextNode("Hello World");

        String clonedText = (String) textNode.clone().getText();
        assertEquals(textNode.getText(), clonedText);

        when(out.output()).thenReturn(mock(Document.OutputSettings.class).withOutputSettings(any()));
    }

}