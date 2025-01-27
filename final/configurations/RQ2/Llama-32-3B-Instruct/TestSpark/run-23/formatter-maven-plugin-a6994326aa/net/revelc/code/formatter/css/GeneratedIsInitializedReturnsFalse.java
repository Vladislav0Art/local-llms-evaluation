package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsInitializedReturnsFalse {

    @Test
    public void isInitializedReturnsFalse() {
        CssFormatter formatter = new CssFormatter();
        boolean result = formatter.isInitialized();
        assert !result;
    }

}