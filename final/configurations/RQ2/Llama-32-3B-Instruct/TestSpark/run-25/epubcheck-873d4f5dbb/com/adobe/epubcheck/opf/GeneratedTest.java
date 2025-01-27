package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    private String validationContext;

    public ValidationContextBuilder setValidationContext(String validationContext) {
        this.validationContext = validationContext;
        return this;
    }

    public ValidationContext build() {
        ValidationContext validationContext = new ValidationContext(validationContext);
        // Add validation context settings
        return validationContext;
    }
}

public class OPFItem {
    private String metadata;

    public OPFItem(String metadata) {
        this.metadata = metadata;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}

public class OPFHandler {
    private boolean handlerFunction;

    public OPFHandler(boolean handlerFunction) {
        this.handlerFunction = handlerFunction;
    }

    public boolean getHandlerFunction() {
        return handlerFunction;
    }

    public void setHandlerFunction(boolean handlerFunction) {
        this.handlerFunction = handlerFunction;
    }
}

public class ValidationContext {
    private String validationContext;

    public ValidationContext(String validationContext) {
        this.validationContext = validationContext;
    }
}

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void testOPFChecker30Creation() {
        ValidationContextBuilder validationContextBuilder = new ValidationContextBuilder().setValidationContext("valid metadata");
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContextBuilder.build());
        opfChecker30.setMetadata("valid content");
        assertTrue(opfChecker30.checkContent());

        OPFItem item = new OPFItem("valid metadata");
        item.setMetadata("valid metadata");
        opfChecker30.setItem(item, new OPFHandler(true));
        assertTrue(opfChecker30.checkItem(item, new OPFHandler(true)));
    }

}