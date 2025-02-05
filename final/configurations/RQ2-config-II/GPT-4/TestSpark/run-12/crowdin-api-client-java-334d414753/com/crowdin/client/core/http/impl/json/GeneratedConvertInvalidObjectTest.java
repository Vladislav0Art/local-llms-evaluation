package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.Assert;
import com.crowdin.client.core.http.exceptions.HttpException;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class GeneratedConvertInvalidObjectTest {

    @Test
    public void convertInvalidObjectTest() {
        JacksonJsonTransformer transformer = mock(JacksonJsonTransformer.class);
        Project project = new Project();
        project.setName("test");

        doThrow(new RuntimeException()).when(transformer).convert(project);
        transformer.convert(project);
    }

}