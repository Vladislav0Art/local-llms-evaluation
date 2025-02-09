package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertNullObjectTest {

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        String json = transformer.convert(null);

        assertNull(json);
    }

}