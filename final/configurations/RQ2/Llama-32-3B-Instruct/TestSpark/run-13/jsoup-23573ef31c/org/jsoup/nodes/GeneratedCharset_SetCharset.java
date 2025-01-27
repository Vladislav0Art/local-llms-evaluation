package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCharset_SetCharset {

    @Mock
    private Connection connection;

    @Mock
    private String baseUri;

    @Test
    public void charset_SetCharset() {
        Document document = new Document(baseUri);
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        Mockito.verify(document).charset(Mockito.any(Charset.class));
    }

}