package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedInsertStartTag {

"classpath:test.xml"
})

public class XmlTreeBuilderTest {

    @Mock
    private TreeBuilder treeBuilder;

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private Reader reader;

    @Mock
    private String baseUri;

    @Mock
    private Parser parser;

    public XmlTreeBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test the default settings method of XmlTreeBuilder.
     */

    @Test
    public void insertStartTag() {
        when(treeBuilder.insert(new Token.StartTag())).thenReturn(new Element());

        // Act
        Element element = treeBuilder.insert(new Token.StartTag());

        // Assert
        assertNotNull(element);
    }

}