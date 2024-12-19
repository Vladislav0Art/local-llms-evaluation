package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsXmlDeclaration_ReturnsFalse_WithoutValidData {

    @Mock
    private Appendable accum;

    @Test
    public void isXmlDeclaration_ReturnsFalse_WithoutValidData() {
        // given
        when(accum.append(anyString())).thenReturn(this.accum);

        new Comment("<!-- This is not an XML Declaration -->").outerHtmlHead(accum, 0, null);
        assertFalse(new Comment("").isXmlDeclaration());
    }

}