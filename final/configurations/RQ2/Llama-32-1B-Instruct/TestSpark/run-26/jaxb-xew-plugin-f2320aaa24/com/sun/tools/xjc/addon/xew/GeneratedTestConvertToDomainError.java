package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GeneratedTestConvertToDomainError {

    @Test
    public void testConvertToDomainError() {
        Class<?> domain = Domain.class;
        Object[] source = {new java.util.ArrayList<>(), new java.util.ArrayList<>()};
        String[] target = {"5", "6"};

        assertArrayEquals(source, convert(domain, source));
        assertArrayEquals(target, convert(domain, target));
    }

    private static Object[] convert(Class<?> domainClass, Object[] source) {
        return convert(domainClass, null, source);
    }

    private <T> T[] convert(Class<T> domainClass, String[] sources, Object[] targets) {
        if (domainClass == Domain.class) {
            List<String> values = new ArrayList<>();
            for (String value : sources) {
                values.add(value);
            }
            return new Object[]{values.toArray(), targets};
        } else if (domainClass == AnotherDomain.class) {
            List<Object[]> result = new ArrayList<>();

            // add source arrays to the results
            result.add(new java.util.Arrays.asList(sources));

            // and the target list of strings, then convert each string in the array
            for (Object[] source : sources) {
                Object[] convertedSource = convert(domainClass, null, source);
                String[] target = new String[convertedSource.length];
                System.arraycopy(convertedSource, 0, target, 0, convertedSource.length);

                result.add(target);
            }

            return result.toArray();
        } else {
            throw new UnsupportedOperationException("Unsupported domain class");
        }
    }

}