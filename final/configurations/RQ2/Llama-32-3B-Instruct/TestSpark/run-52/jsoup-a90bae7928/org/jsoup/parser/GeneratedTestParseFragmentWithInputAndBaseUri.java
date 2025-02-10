package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTestParseFragmentWithInputAndBaseUri {

    @Mock
    private TreeBuilder treeBuilder;

    @Mock
    private Token token;

    @Mock
    private Node node;

    @Mock
    private Element element;

    @Mock
    private Comment comment;

    @Mock
    private TextNode text;

    @Mock
    private DocumentType documentType;

    @Mock
    private Document document;

    @Config
    public static class Config {
    }

    @Test
    public void testParseFragmentWithInputAndBaseUri() {
        when(treeBuilder.parseFragment("example", token, document)).thenReturn(List.of(node));
        List<Node> result = treeBuilder.parseFragment("example", token, document);
        assertNotNull(result);
        assertEquals(1, result.size());
    }

}