package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_withDirectivesJavaAnnotation_shouldReturnDirectives {

    private AnnotatedElement object;
    private ProcessingElementsContainer container;
    private DirectivesBuilder builder;

    @Before
    public void setUp() throws Exception {
        object = Mockito.mock(AnnotatedElement.class);
        container = Mockito.mock(ProcessingElementsContainer.class);
        builder = new DirectivesBuilder(object, container);
    }

    @Test
    public void build_withDirectivesJavaAnnotation_shouldReturnDirectives() {
        // Arrange
        DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)
                .forEach(annotation -> {
                    String name = DirectiveJavaAnnotationUtil.getName(annotation);
                    if (container.getDirectiveRegistry().containsKey(name)) {
                        GraphQLDirective graphQLDirective = transformArgs(container.getDirectiveRegistry().get(name).getDirective(), annotation);
                        graphQLDirectives.add(graphQLDirective);
                    } else {
                        throw new GraphQLAnnotationsException(String.format(NOT_FOUND_IN_DIRECTIVE_REGISTRY_ERROR, name), null);
                    }

                }