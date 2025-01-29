package com.ezylang.evalex.parser;

import org.junit.Test;

public class GeneratedTestOperatorDictionaryIfc {

    @Test
    public void testOperatorDictionaryIfc() {
        EvalConfig evalConfig = new EvalConfig();

        OperatorDictionaryIfc operatorDict = new EvalEx.OperatorDictionaryIfc();
        String eqStr = "int a, int b -> return a == b";
        EvalEx.EvalFunc evalFunc = new EvalEx.EvalFunc(operatorDict);
        ((EvalEx.EvalFunc) evalFunc).addOperator("eq", eqStr);

        mapPropertyAndSetValue(evalConfig, operatorDict, "operators");
    }

    public void mapPropertyAndSetValue(EvalConfig config, Object dictionary, String key) {
        if (config.getProperty(key) instanceof Map) {
            ((Map<String, Object>) config.getProperty(key)).putAll((Map<String, Object>) dictionary);
        } else {
            config.setProperty(key, dictionary);
        }
    }

    public static class EvalConfig {
        private Properties properties = new Properties();

        @Override
        public void put(String key, Object value) {
            this.properties.put(key, value);
        }

        @Override
        public Map<String, Object> getProperty(String key) {
            return (Map<String, Object>) this.properties.get(key);
        }
    }

    public static class EvalEx {
        public static class FunctionDictionaryIfc {
            private Properties properties = new Properties();

            public void addProperty(String key, Object value) {
                properties.put(key, value);
            }

            public Map<String, Object> getProperties() {
                return properties;
            }
        }

        public static class EvalFunc {
            private Map<String, String> functions = new HashMap<>();
            private Map<String, Object> operators = new HashMap<>();

            public void addFunction(String funcName, String funcStr) {
                functions.put(funcName, funcStr);
            }

            @Override
            public Map<String, String> getProperties() {
                return functions;
            }
        }
    }

}