package org.jsoup.parser;

public class GeneratedTest {

    private HtmlTreeBuilder underTest;
    private Reader reader;
    private Parser parser;

    @Before
    public void setup() {
        // Initialize the test data
        String inputFragment = "Hello World!";
        String baseUri = "https://example.com";
        ParseSettings defaultSettings = new ParseSettings();
        underTest = new HtmlTreeBuilder(defaultSettings);
        reader = new Reader(inputFragment, baseUri, parser);
    }

    @Test
    public void testParseFragment() {
        // Test the parseFragment method
        List<Node> nodes = underTest.parseFragment("Hello World!");
        assertEquals(1, nodes.size());
        assertEquals("Hello World!", nodes.get(0).getValue());
    }

    @Test
    public void testInitialiseParse() {
        // Test the initialiseParse method
        underTest.initialiseParse(reader, baseUri, parser);
        assertNotNull(underTest - State.originalState());
        assertEquals(baseUri, underTest - State.originalState().getBaseUri());
    }

    @Test
    public void testProcessToken() {
        // Test the process method
        assertFalse(underTest.process("tag", null));
    }

    @Test
    public void testProcessTokenWithToken() {
        // Test the process method with a token
        underTest - State.state().setToken("token");
        boolean result = underTest.process("token", underTest - State.state());
        assertTrue(result);
    }

    @Test
    public void testTransitionState() {
        // Test the transition method
        underTest.transition(underTest - State.originalState());
        assertEquals(underTest - State.originalState(), underTest - State.state());
    }

    @Test
    public void testMarkInsertionMode() {
        // Test the markInsertionMode method
        underTest.markInsertionMode();
        assertTrue(underTest - State.isInsertionMode());
    }

    @Test
    public void testGetDocument() {
        // Test the getDocument method
        Document document = underTest.getDocument();
        assertNotNull(document);
        assertEquals("Hello World!", document.getValue());
    }

    @Test
    public void testGetBaseUri() {
        // Test the getBaseUri method
        String uri = underTest.getBaseUri();
        assertEquals("https://example.com", uri);
    }

    @Test
    public void testMaybeSetBaseUri() {
        // Test the maybeSetBaseUri method
        Element base = new Element("<base href=\"https://example.com\"/>");
        underTest.maybeSetBaseUri(base);
        assertTrue(underTest - State.originalState().getBaseUri().equals("https://example.com"));
    }

    @Test
    public void testIsFragmentParsing() {
        // Test the isFragmentParsing method
        assertFalse(underTest.isFragmentParsing());
        underTest.parseFragment("", "", "");
        assertTrue(underTest.isFragmentParsing());
    }

    @Test
    public void testErrorHandling() {
        // Test error handling
        underTest.error(new Error("test error"));
        boolean result = underTest - State.state().error();
        assertFalse(result);
    }

    @Test
    public void testInsertElement() {
        // Test the insert method
        Element element = new Element("<p>Hello World!</p>");
        underTest.insert(element);
        assertEquals(1, underTest - State.getStack().size());
        assertEquals("Hello World!", underTest - State.getStack().get(0).getValue());
    }

    @Test
    public void testInsertEmpty() {
        // Test the insert method with an empty tag
        Element element = new Element("<p></p>");
        underTest.insert(element);
        assertEquals(1, underTest - State.getStack().size());
        assertEquals("", underTest - State.getStack().get(0).getValue());
    }

    @Test
    public void testGetActiveFormattingElement() {
        // Test the getActiveFormattingElement method
        Element element = new Element("<span style=\"color: red\">Hello World!</span>");
        underTest.insert(element);
        assertEquals("Hello World!", element.getValue());
        assertEquals(0, underTest - State.getActiveFormattingElement("style").size());
    }

    @Test
    public void testPushActiveFormattingElements() {
        // Test the pushActiveFormattingElements method
        Element element = new Element("<span style=\"color: red\">Hello World!</span>");
        underTest.insert(element);
        assertEquals(1, underTest - State.getActiveFormattingElement("style").size());
        assertEquals("Hello World!", underTest - State.getActiveFormattingElement("style").get(0).getValue());
    }

    @Test
    public void testInsertInFosterParent() {
        // Test the insert method with a node in the foster parent
        Element element = new Element("<p>Hello World!</p>");
        underTest.insert(element);
        assertEquals(1, underTest - State.getStack().size());
        assertEquals("Hello World!", underTest - State.getStack().get(0).getValue());
    }

    @Test
    public void testTemplateMode() {
        // Test the pushTemplateMode method
        underTest.pushTemplateMode(new HtmlTreeBuilderState());
        assertEquals(1, underTest - State.templateModeSize());
        assertEquals(underTest - State.templateMode(), underTest - State.currentTemplateMode());
    }

}