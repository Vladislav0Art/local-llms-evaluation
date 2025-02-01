package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTextSetValueTest {

    @Test
    public void textSetValueTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("test2");
        assertThat(textNode.text(), is("test2"));
    }

}