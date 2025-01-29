package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTest {

    @Test
    public void testParseName() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("parseName", String.class);
        Object appVersion = (Object) method.invoke(test, "ami-abc123");
        assertNotNull(appVersion);

        assertEquals("ami-abc123", ((String) appVersion).trim());
    }

    @Test
    public void testParseNameNull() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("parseName", String.class);
        Object appVersion = (Object) method.invoke(test, null);
        assertNotNull(appVersion);

        assertEquals(null, ((String) appVersion).trim());
    }

    @Test
    public void testParseNameEmpty() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("parseName", String.class);
        Object appVersion = (Object) method.invoke(test, "");
        assertNotNull(appVersion);

        assertEquals("", ((String) appVersion).trim());
    }

    @Test
    public void testParseNameNullParam() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("parseName", String.class);
        Object[] args = {null};
        try {
            (Object) method.invoke(test, args);
            fail("Expected NullPointerException");
        } catch (Exception e) {
            pass;
        }
    }

    @Test
    public void testGetPackageName() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getPackageName", String.class);
        Object appVersion = (Object) method.invoke(test, "ami-abc123");
        assertNotNull(appVersion);

        assertEquals("ami-abc123", ((String) appVersion).trim());
    }

    @Test
    public void testGetPackageNameNull() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getPackageName", String.class);
        Object appVersion = (Object) method.invoke(test, null);
        assertNotNull(appVersion);

        assertEquals(null, ((String) appVersion).trim());
    }

    @Test
    public void testGetPackageNameEmpty() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getPackageName", String.class);
        Object appVersion = (Object) method.invoke(test, "");
        assertNotNull(appVersion);

        assertEquals("", ((String) appVersion).trim());
    }

    @Test
    public void testGetPackageNameNullParam() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getPackageName", String.class);
        Object[] args = {null};
        try {
            (Object) method.invoke(test, args);
            fail("Expected NullPointerException");
        } catch (Exception e) {
            pass;
        }
    }

    @Test
    public void testGetVersionNumber() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getVersionNumber", String.class);
        Object appVersion = (Object) method.invoke(test, "ami-abc123");
        assertNotNull(appVersion);

        assertEquals("ami-abc123", ((String) appVersion).trim());
    }

    @Test
    public void testGetVersionNumberNull() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getVersionNumber", String.class);
        Object appVersion = (Object) method.invoke(test, null);
        assertNotNull(appVersion);

        assertEquals(null, ((String) appVersion).trim());
    }

    @Test
    public void testGetVersionNumberEmpty() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getVersionNumber", String.class);
        Object appVersion = (Object) method.invoke(test, "");
        assertNotNull(appVersion);

        assertEquals("", ((String) appVersion).trim());
    }

    @Test
    public void testGetVersionNumberNullParam() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getVersionNumber", String.class);
        Object[] args = {null};
        try {
            (Object) method.invoke(test, args);
            fail("Expected NullPointerException");
        } catch (Exception e) {
            pass;
        }
    }

    @Test
    public void testGetBuildJobName() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getBuildJobName", String.class);
        Object appVersion = (Object) method.invoke(test, "ami-abc123");
        assertNotNull(appVersion);

        assertEquals("ami-abc123", ((String) appVersion).trim());
    }

    @Test
    public void testGetBuildJobNameNull() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getBuildJobName", String.class);
        Object appVersion = (Object) method.invoke(test, null);
        assertNotNull(appVersion);

        assertEquals(null, ((String) appVersion).trim());
    }

    @Test
    public void testGetBuildJobNameEmpty() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getBuildJobName", String.class);
        Object appVersion = (Object) method.invoke(test, "");
        assertNotNull(appVersion);

        assertEquals("", ((String) appVersion).trim());
    }

    @Test
    public void testGetBuildJobNameNullParam() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getBuildJobName", String.class);
        Object[] args = {null};
        try {
            (Object) method.invoke(test, args);
            fail("Expected NullPointerException");
        } catch (Exception e) {
            pass;
        }
    }

    @Test
    public void testGetBuildJobNameEmpty() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getBuildJobName", String.class);
        Object appVersion = (Object) method.invoke(test, "");
        assertNotNull(appVersion);

        assertEquals("", ((String) appVersion).trim());
    }

    @Test
    public void testGetBuildJobNameNullParam() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getBuildJobName", String.class);
        Object[] args = {null};
        try {
            (Object) method.invoke(test, args);
            fail("Expected NullPointerException");
        } catch (Exception e) {
            pass;
        }
    }

    @Test
    public void testGetBuildJobNameEmpty() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getBuildJobName", String.class);
        Object appVersion = (Object) method.invoke(test, "");
        assertNotNull(appVersion);

        assertEquals("", ((String) appVersion).trim());
    }

}