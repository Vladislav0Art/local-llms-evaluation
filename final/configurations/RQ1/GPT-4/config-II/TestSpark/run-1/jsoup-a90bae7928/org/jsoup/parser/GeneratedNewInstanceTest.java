package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.Reader;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewInstanceTest {

    @Mock
    private Reader reader;

    @Mock
    private Parser parser;

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Assert.assertNotNull(treeBuilder.newInstance());
    }

}