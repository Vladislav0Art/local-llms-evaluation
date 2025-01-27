package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParser_SetParser {

    @Mock
    private Connection connection;

    @Mock
    private String baseUri;

    @Test
    public void parser_SetParser() {
        Document document = new Document(baseUri);
        Parser parser = Mockito.mock(Parser.class);
        document.parser(parser);
        Mockito.verify(document).parser(Mockito.any(Parser.class));
    }

}