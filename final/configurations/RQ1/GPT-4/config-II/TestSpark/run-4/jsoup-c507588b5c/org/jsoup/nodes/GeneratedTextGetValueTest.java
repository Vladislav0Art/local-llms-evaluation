package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextGetValueTest {

    @Test
    public void textGetValueTest() {
        TextNode textNode = new TextNode("test");
        assertThat(textNode.text(), is("test"));
    }

}