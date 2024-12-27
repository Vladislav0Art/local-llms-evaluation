package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void defaultSettings_ReturnsDefaultSettings() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assertNotNull(settings);
    }

    @Test
    public void newInstance

    ReturnsANewInstance() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        HtmlTreeBuilder instance = builder.newInstance();
        assertNotNull(instance);
        assertNotSame(builder, instance);
    }

    @Test
    public void initialiseParse_ParsesInputCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        String input = "input";
        String baseUri = "/baseuri";
        Parser parser = new Parser();
        builder.initialiseParse(input, baseUri, parser);
        assertNotNull(builder.parseFragment(input, null, baseUri, parser));
    }

    @Test
    public void process_TokenIsProcessedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Token token = new Token();
        assertTrue(builder.process(token));
    }

    @Test
    public void process_TOKENAndStateAreProcessedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Token token = new Token();
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        assertTrue(builder.process(token, state));
    }

    @Test
    public void transition_TransitionIsPerformedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        builder.transition(state);
        assertNotNull(builder.state());
    }

    @Test
    public void markInsertionMode_MarkIsInsertedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.markInsertionMode();
        assertTrue(builder.isFragmentParsing());
    }

    @Test
    public void framesetOk

    FramesetIsCheckedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        boolean framesetOk = true;
        builder.framesetOk(framesetOk);
        assertTrue(framesetOk);
    }

    @Test
    public void insertStartTag_ElementIsInsertedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element element = new Element();
        assertEquals(element, builder.insertStartTag("tag"));
    }

    @Test
    public void framesetFrameElementIsInsertedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Token token = new Token();
        assertTrue(builder.framesetOk(token));
    }

    @Test
    public void pop_PopIsPerformedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element element = new Element();
        assertEquals(element, builder.pop());
    }

    @Test
    public void pushPushIsPerformedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element element = new Element();
        builder.push(element);
        assertTrue(builder.onStack(element));
    }

    @Test
    public void getStack_GetStackReturnsCorrectElements() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        List<Element> stack = builder.getStack();
        assertNotNull(stack);
    }

    @Test
    public void insertOnStackAfter_InsertIsPerformedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element after = new Element();
        Element in = new Element();
        builder.insertOnStackAfter(after, in);
        assertTrue(builder.onStack(in));
    }

    @Test
    public void popTemplateMode_PopIsPerformedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        assertEquals(state, builder.popTemplateMode());
    }

    @Test
    public void pushTemplateModePushIsPerformedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        builder.pushTemplateMode(state);
        assertNotNull(builder.currentTemplateMode());
    }

}