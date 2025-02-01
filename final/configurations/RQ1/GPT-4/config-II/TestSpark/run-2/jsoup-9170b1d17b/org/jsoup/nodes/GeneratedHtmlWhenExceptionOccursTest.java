package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedHtmlWhenExceptionOccursTest {

    @Test
    public void htmlWhenExceptionOccursTest() {
        Attributes spyAttributes = Mockito.spy(new Attributes());
        spyAttributes.put("key", "value");

        doThrow(new RuntimeException()).when(spyAttributes).html(any(), any());

        spyAttributes.html();
    }

}