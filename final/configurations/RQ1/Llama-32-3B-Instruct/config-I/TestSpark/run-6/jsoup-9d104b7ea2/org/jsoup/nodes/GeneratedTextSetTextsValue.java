package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedTextSetTextsValue {

    @Test
    public void textSetTextsValue() {
        String value = "Hello World";
        TextNode textNode = new TextNode(value);
        textNode.text("New Value");
        assertThat(textNode.text(), is("New Value"));
    }

}