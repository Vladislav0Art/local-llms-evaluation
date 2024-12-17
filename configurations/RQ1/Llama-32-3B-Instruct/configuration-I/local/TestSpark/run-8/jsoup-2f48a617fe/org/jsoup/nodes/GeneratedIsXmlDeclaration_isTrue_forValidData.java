package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsXmlDeclaration_isTrue_forValidData {

    private Appendable accum = new StringBuilder();

    @Test
    public void isXmlDeclaration_isTrue_forValidData() {
        String data = "Hello World!";
        Comment(comment, accum);
        assertTrue(isXmlDeclaration(data));
    }

}