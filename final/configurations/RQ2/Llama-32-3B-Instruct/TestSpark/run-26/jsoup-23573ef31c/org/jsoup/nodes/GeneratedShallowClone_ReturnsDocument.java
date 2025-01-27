package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedShallowClone_ReturnsDocument {

    @Mock
    private Element element;

    @Test
    public void shallowClone_ReturnsDocument() {
        var document = new Document();
        var result = document.shallowClone();
        Assert.assertNotNull(result);
    }

}