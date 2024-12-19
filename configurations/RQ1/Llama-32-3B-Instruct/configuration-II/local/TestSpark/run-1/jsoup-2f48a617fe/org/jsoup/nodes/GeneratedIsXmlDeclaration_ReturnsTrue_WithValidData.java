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
public class GeneratedIsXmlDeclaration_ReturnsTrue_WithValidData {

    @Mock
    private Appendable accum;

    @Test
    public void isXmlDeclaration_ReturnsTrue_WithValidData() {
        // given
        when(accum.append(anyString())).thenReturn(this.accum);

        new Comment("<!--<?xml version='1.0' encoding='UTF-8'?> -->").outerHtmlHead(accum, 0, null);
        assertTrue(new Comment("").isXmlDeclaration());
    }

}