package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void newInstanceTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        assertNotSame(treeBuilder, null);
    }

    @Test
    public void initialiseParseTest() {
        String baseUri = "http://example.com";
        Reader reader = new FileReader("input.html");
        Parser parser = new Parser();
        HtmlTreeBuilderState state = treeBuilder.initialiseParse(reader, baseUri, parser);

        assertEquals(state, treeBuilder.defaultSettings());
    }

    @Test
    public void parseFragmentTest() {
        String inputFragment = "<p>This is a paragraph</p>";
        HtmlTreeBuilderState state = treeBuilder.parseFragment(inputFragment);
        assertNotSame(state, null);
    }

    @Test
    public void processTokenTest1() {
        Token token = new Token();
        boolean result = treeBuilder.process(token);
        assertTrue(result);
    }

    @Test
    public void processTokenTest2() {
        Token token = new Token();
        HtmlTreeBuilderState state = treeBuilder.process(token, HtmlTreeBuilderState.HIDDEN);
        assertEquals(state, treeBuilder.defaultSettings());
    }

    @Test
    public void insertElementTest1() {
        Element element = treeBuilder.insert(new Token.StartTag("p"));
        assertNotSame(element, null);
    }

    @Test
    public void insertElementTest2() {
        Element element = new Element();
        treeBuilder.insert(element);
        assertEquals(treeBuilder.getStack(), Arrays.asList(element));
    }

    @Test
    public void clearStackTest1() {
        List<Element> stack = treeBuilder.getStack();
        treeBuilder.clearStackToTableContext();
        assertNotSame(stack, null);
    }

    @Test
    public void clearStackTest2() {
        Element element = new Element();
        List<Element> stack = treeBuilder.getStack();
        stack.add(element);
        treeBuilder.clearStackToTableRowContext();
        assertEquals(stack, Arrays.asList(element));
    }

}