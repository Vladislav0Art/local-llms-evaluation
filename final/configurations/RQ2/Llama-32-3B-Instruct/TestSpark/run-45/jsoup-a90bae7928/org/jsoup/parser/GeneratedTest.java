package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private TreeBuilder treeBuilder;

    @Mock
    private Parser parser;

    @Mock
    private Reader reader;

    @Mock
    private String baseUri;

    public Element insertStartTag(String tagName) {
        when(treeBuilder.insert(any(Token.StartTag.class))).thenReturn(new Element(tagName));
        return (Element) any();
    }

    public void processCharacter(char character) throws IOException {
        when(parser.processCharacter(character)).thenAnswer(() -> {
            // Process the character
            return null;
        });
    }

    @Test
    public void parseDocumentFromReader() throws IOException {
        Document document = insertStartTag("root");
        String input = "<html><body>Hello World!</body></html>";
        when(reader.toString()).thenReturn(input);
        Document result = XmlTreeBuilder.newInstance().parse(reader, baseUri);
        assertThat(result, notNullValue());
    }

    @Test
    public void parseDocumentFromString() {
        Document document = insertStartTag("root");
        String input = "<html><body>Hello World!</body></html>";
        when(reader.toString()).thenReturn(input);
        Document result = XmlTreeBuilder.newInstance().parse(input, baseUri);
        assertThat(result, notNullValue());
    }

    @Test
    public void initialisationParse() {
        XmlTreeBuilder builder = insertStartTag("root");
        builder.initialiseParse(reader, baseUri, parser);
    }

    @Test
    public void parseFragmentFromReader() throws IOException {
        Document document = insertStartTag("root");
        String input = "<html><body>Hello World!</body></html>";
        when(reader.toString()).thenReturn(input);
        List<Node> result = XmlTreeBuilder.newInstance().parseFragment(reader, baseUri, parser);
        assertThat(result.size(), is(2));
    }

    @Test
    public void parseFragmentFromReaderWithContext() throws IOException {
        Document document = insertStartTag("root");
        String input = "<html><body>Hello World!</body></html>";
        when(reader.toString()).thenReturn(input);
        List<Node> result = XmlTreeBuilder.newInstance().parseFragment(reader, new Element(), baseUri, parser);
        assertThat(result.size(), is(2));
    }

    @Test
    public void initialiseParseReader() throws IOException {
        XmlTreeBuilder builder = insertStartTag("root");
        reader.read();
        builder.initialiseParse(reader, baseUri, parser);
    }

}