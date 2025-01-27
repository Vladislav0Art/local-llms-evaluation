package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCharset_SetsCharset {

    @Mock
    private Element element;

    @Test
    public void charset_SetsCharset() {
        var expected = Charset.forName("UTF-8");
        var result = new Document().charset(expected);
        Assert.assertEquals(expected, result.charset());
    }

}