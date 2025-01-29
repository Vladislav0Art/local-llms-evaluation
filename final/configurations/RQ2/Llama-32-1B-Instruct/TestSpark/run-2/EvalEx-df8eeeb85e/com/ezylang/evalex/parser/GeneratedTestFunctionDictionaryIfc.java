package com.ezylang.evalex.parser;

import org.junit.Test;

public class GeneratedTestFunctionDictionaryIfc {

    @Test
    public void testFunctionDictionaryIfc() {
        EvalConfig evalConfig = new EvalConfig();

        FunctionDictionaryIfc functionDict = new EvalEx.FunctionDictionaryIfc();
        String addStr = "int a, int b -> return a + b";
        EvalEx.EvalFunc evalFunc = new EvalEx.EvalFunc(functionDict);
        ((EvalEx.EvalFunc) evalFunc).addFunction("add", addStr);

        mapPropertyAndSetValue(evalConfig, functionDict, "functions");
    }

}