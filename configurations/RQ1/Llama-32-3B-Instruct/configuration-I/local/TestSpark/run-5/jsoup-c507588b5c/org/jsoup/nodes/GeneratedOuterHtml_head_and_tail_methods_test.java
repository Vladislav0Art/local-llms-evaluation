package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedOuterHtml_head_and_tail_methods_test {

    @Test
    public void outerHtml_head_and_tail_methods_test() {
        // Mock out coreValue, parent and appendable methods as they are not testable without mocking out JSoup's
        // core logic (which is currently under development). The purpose of these tests is to verify the
        // structure of the outerHtml method.
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World!");
        textNode.parentNode = null;

        textNode.outerHtmlHead(appendable, 0, outputSettings);
        assertEquals("<p>Hello World!</p>", appendable.toString());

        textNode.outerHtmlTail(appendable, 0, outputSettings);
    }

}