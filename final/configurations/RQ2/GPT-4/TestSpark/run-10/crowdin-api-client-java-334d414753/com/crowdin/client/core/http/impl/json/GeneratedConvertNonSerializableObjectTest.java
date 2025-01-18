package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;

import java.text.DateFormat;
import java.util.TimeZone;
import java.util.Locale;

public class GeneratedConvertNonSerializableObjectTest {

    @Test
    public void convertNonSerializableObjectTest() throws CrowdinApiException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        // Create a new instance of DateFormat which is not serializable
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        // Expect an exception due to trying to convert a non-serializable object
        String result = transformer.convert(df);
    }

}