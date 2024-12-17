package org.jsoup.nodes;

public class GeneratedAppendToString {

    @Override
    public void append(String text) {
        super.append(text);
    }
}

public class TextNodeAppenderTest {

    private TestMockTextNode mockText;
    private String expectedData;

    public TextNodeAppenderTest() {
        mockText = new TestMockTextNode();
        expectedData = "Hello";
    }

    @Test
    public void appendToString() {
        mockText.append("World");
        assertEquals(expectedData, mockText.text.data);
    }

}