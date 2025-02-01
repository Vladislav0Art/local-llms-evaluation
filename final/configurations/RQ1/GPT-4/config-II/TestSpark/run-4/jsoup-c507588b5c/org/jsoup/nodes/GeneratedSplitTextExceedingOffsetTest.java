package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextExceedingOffsetTest {

    @Test
    public void splitTextExceedingOffsetTest() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(5);
    }

}