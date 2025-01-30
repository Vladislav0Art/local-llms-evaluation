package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.messages.MessageId;
import io.mola.galimatias.URL;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.initHandler();
        Assert.assertNotNull(opfChecker30.checkerFactory);
    }

}