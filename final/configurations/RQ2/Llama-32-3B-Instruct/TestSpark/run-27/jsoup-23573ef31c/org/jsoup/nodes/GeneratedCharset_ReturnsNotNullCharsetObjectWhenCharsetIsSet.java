package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCharset_ReturnsNotNullCharsetObjectWhenCharsetIsSet {

    @Mock
    private Connection connectionMock;

    @Mock
    private Parser parserMock;

    @Mock
    private Element elementMock;

    public static final String BASE_URI = "https://example.com";

    public static final String CSS_QUERY = "#test";

    @Test
    public void charset_ReturnsNotNullCharsetObjectWhenCharsetIsSet() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document(BASE_URI);
        document.charset(charset);
        Mockito.verify(elementMock, Mockito.never()).charset();
        Assert.assertEquals(charset, document.charset());
    }

}