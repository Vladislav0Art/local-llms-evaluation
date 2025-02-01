package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = TextNode.normaliseWhitespace(" te st ");
        assertThat(text, is("te st"));
    }

}