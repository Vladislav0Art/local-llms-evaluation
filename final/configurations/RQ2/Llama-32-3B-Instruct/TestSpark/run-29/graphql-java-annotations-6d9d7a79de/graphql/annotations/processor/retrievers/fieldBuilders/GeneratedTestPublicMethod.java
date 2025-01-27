package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestPublicMethod {

}

@PublicClass
class TestMyClass {

    @Test
    public void testPublicMethod() {
        // Arrange
        MyClass obj = new MyClass();

        // Act and Assert
        assertTrue(MyClass.class.isPublic());
    }
}

public class Utils {

    public static boolean classIsPublic(Class<?> clazz) {
        return clazz.isPublic();
    }

    public static boolean methodIsPublic(Class<?> clazz, String methodName) throws NoSuchMethodException {
        return clazz.getMethod(methodName).getDeclaringClass().isPublic();
    }

}