package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.ImportOptions;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneratedConvertInvalidObjectTest {

    @Test
    public void convertInvalidObjectTest() {
        Object invalidObject = new SimpleDateFormat();
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(invalidObject);
    }

}