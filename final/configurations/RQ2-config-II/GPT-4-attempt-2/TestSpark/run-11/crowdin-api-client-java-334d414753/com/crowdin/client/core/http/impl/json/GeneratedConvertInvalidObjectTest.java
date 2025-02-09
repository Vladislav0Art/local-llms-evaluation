package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertInvalidObjectTest {


    private static final String JSON_PROJECT = "{\"id\":1,\"name\":\"Test\",\"identifier\":\"test\",\"description\":\"Test project\"}";
    JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertInvalidObjectTest() {
        jsonTransformer.convert(new Object());
    }

}