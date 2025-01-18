package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.JsonTransformer;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertInvalidObjectScenarioTest {

    @Test
    public void convertInvalidObjectScenarioTest() {
        class BrokenObject {
            BrokenObject object = this;
        }
        BrokenObject brokenObject = new BrokenObject();
        JsonTransformer jsonTransformer = new JacksonJsonTransformer();

        jsonTransformer.convert(brokenObject);
    }

}