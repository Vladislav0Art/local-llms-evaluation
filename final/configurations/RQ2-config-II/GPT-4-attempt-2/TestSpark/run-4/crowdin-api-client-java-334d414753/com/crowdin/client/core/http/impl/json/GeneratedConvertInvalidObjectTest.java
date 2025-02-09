package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertInvalidObjectTest {

    @Test
    public void convertInvalidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(new Object());
    }

}