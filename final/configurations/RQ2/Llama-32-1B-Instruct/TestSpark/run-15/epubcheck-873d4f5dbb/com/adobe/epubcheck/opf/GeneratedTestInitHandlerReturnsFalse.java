package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestInitHandlerReturnsFalse {

    private OpfChecker30 checker;

    @BeforeEach
    public void setup() {
        this.checker = new OPFChecker30(ValidationContext.createDefault());
    }

    @Test
    public void testInitHandlerReturnsFalse() {
        when(this.checker).checkPackage();
        doReturn(false).when(this.checker).checkContent();
        OpfChecker30 other = new OPFChecker30(ValidationContext.createDefault());
        assertThat(other.initHandler(), isFalse);
    }

    @AfterEach
    public void tearDown() {
        this.checker = null;
    }
}

class OPFItem {
    private String uri;

    public boolean isUriValid() {
        return uri != null && !Strings.isNullOrEmpty(uri);
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}

}