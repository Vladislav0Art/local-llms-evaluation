package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShallowClone_ShallReturnShallowClone {

    @Mock
    private Connection connection;

    @Mock
    private String baseUri;

    @Test
    public void shallowClone_ShallReturnShallowClone() {
        Document document = new Document(baseUri);
        Document clone = document.shallowClone();
        Mockito.verify(document).shallowClone(Mockito.any(Document.class));
    }

}