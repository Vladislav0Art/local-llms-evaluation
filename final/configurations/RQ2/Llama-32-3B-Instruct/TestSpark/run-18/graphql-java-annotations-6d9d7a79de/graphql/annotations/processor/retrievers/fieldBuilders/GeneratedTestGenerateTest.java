package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestGenerateTest {

    public static GraphQLDirectives.QUERY DIRECTIVES_QUERY = new GraphQLDirectives().QUERY();
    public static GraphQLDirectives.ENVIRONMENT DIRECTIVES_ENVIRONMENT = new GraphQLDirectives().ENVIRONMENT();
    public static GraphQLDirectives.SECURITY DIRECTIVES_SECURITY = new GraphQLDirectives().SECURITY();
}

public class DirectiveJavaAnnotationUtil {
    public static List<String> getDirectivesAsNames(AnnotatedElement object) {
        return Arrays.asList(DirectivesBuilder.DIRECTIVES_QUERY.getName(), DirectivesBuilder.DIRECTIVES_ENVIRONMENT.getName(), DirectivesBuilder.DIRECTIVES_SECURITY.getName());
    }

    public static String getJavaName(String directive) {
        // Implementation of the method
        return "";
    }
}

public class GeneratedTest extends BaseTest {

    @Test
    public void testGenerateTest() throws Exception {
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        AnnotatedElement object = DirectivesBuilder.DIRECTIVES_QUERY;
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        when(container).isNull();
        GraphQLDirectives directives = builder.build();
        assertNotEquals(0, directives.toArray().length);
    }

}