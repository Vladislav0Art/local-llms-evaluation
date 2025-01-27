package net.e175.klaus.solarpositioning;

public class GeneratedTestEstimate {

    @Test
    public void testEstimate() {
        DeltaT deltaT = new DeltaT();
        assertEquals(0.0, deltaT.estimate(null), 0.0001);
    }

    public static double estimate(LocalDate forDate) {
        // implementation
        return 0.0;
    }
}

public class Mockito {

    public static void when(Class<?> clazz, String methodName, Object... args) {
        try {
            java.lang.reflect.Method method = clazz.getMethod(methodName, getParameterTypes(args));
            if (method == null) {
                throw new NoSuchMethodException();
            }
        } catch (NoSuchMethodException e) {
            // handle exception
        }
    }

    public static Class<?>[] getParameterTypes(Object... args) {
        Class<?>[] types = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            types[i] = args[i].getClass();
        }
        return types;
    }

}