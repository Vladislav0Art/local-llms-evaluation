package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateShell_ShouldReturnDocument {

    @Mock
    private Connection connection;

    @Mock
    private String baseUri;

    @Test
    public void createShell_ShouldReturnDocument() {
        Document document = Document.createShell(baseUri);
        Mockito.verify(document).connection(Mockito.any(Connection.class));
    }

}