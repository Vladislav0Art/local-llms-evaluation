package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedUpdateMetaCharsetElement_ReturnsBoolean {

    @Mock
    private Element element;

    @Test
    public void updateMetaCharsetElement_ReturnsBoolean() {
        var document = new Document();
        var expected = true;
        Assert.assertTrue(document.updateMetaCharsetElement());
    }

}