package com.ezylang.evalex.parser;

import org.junit.Test;

public class GeneratedTestExpressionConfiguration {

    @Test
    public void testExpressionConfiguration() {
        EvalConfig evalConfig = new EvalConfig();

        evalConfig.addProperty("name", "eval_config");

        Map<String, Object> properties = (Map<String, Object>) evalConfig.getProperty("name");
        ((EvalConfig.EvalConfig.Properties) properties.get("properties")).addProperty("name", "eval_properties");
    }

}