package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTest {

    @Test
    public void testBuildWithoutArguments() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertNotNull(directives);
    }

    @Test
    public void testBuildWithDirectives() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        List<GraphQLDirective> graphqlDirectives = Arrays.stream(directives).map(GraphQLDirective::getDefinition).collect(Collectors.toList());
        assertEquals("directives", graphqlDirectives.get(0).getName());
    }

    @Test
    public void testBuildWithDirectivesAndArguments() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        List<GraphQLDirective> graphqlDirectives = Arrays.stream(directives).map(GraphQLDirective::getDefinition).collect(Collectors.toList());
        assertEquals("directives", graphqlDirectives.get(0).getName());
    }

    @Test
    public void testBuildWithDirectivesAndArgumentsAndType() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        List<GraphQLDirective> graphqlDirectives = Arrays.stream(directives).map(GraphQLDirective::getDefinition).collect(Collectors.toList());
        assertEquals("directives", graphqlDirectives.get(0).getName());
    }

    @Test
    public void testBuildWithoutTypeArguments() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertNotNull(directives);
    }

    @Test
    public void testBuildWithMultipleDirectives() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        List<GraphQLDirective> graphqlDirectives = Arrays.stream(directives).map(GraphQLDirective::getDefinition).collect(Collectors.toList());
        assertEquals("directives", graphqlDirectives.get(0).getName());
    }

    @Test
    public void testBuildWithoutMultipleDirectives() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertNotNull(directives);
    }

    @Test
    public void testGetDefinition() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        List<GraphQLDirective> graphqlDirectives = Arrays.stream(directives).map(GraphQLDirective::getDefinition).collect(Collectors.toList());
        assertEquals(1, graphqlDirectives.size());
    }

    @Test
    public void testGetDefinitionWithMultipleDirectives() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        List<GraphQLDirective> graphqlDirectives = Arrays.stream(directives).map(GraphQLDirective::getDefinition).collect(Collectors.toList());
        assertEquals(2, graphqlDirectives.size());
    }

    @Test
    public void testGetDefinitionWithMultipleTypes() {
        AnnotatedElement object = new Object();
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] directives = directivesBuilder.build();
        List<GraphQLDirective> graphqlDirectives = Arrays.stream(directives).map(GraphQLDirective::getDefinition).collect(Collectors.toList());
        assertEquals(3, graphqlDirectives.size());
    }

}