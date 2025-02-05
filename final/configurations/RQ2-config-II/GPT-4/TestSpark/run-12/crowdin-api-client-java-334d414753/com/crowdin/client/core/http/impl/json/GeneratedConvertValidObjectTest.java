package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.Assert;
import com.crowdin.client.core.http.exceptions.HttpException;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("test");
        String json = transformer.convert(project);
        Assert.assertEquals("{\"name\":\"test\"}", json);
    }

}