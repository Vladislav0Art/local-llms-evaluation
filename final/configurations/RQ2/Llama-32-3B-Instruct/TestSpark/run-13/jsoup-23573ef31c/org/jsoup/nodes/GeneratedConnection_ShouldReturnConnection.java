package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConnection_ShouldReturnConnection {

    @Mock
    private Connection connection;

    @Mock
    private String baseUri;

    @Test
    public void connection_ShouldReturnConnection() {
        Document document = new Document(baseUri);
        Connection result = document.connection();
        Mockito.verify(document).connection(Mockito.any(Connection.class));
    }

}