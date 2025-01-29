package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedFieldBuildersTest_Initialization {

    @Test
    public void FieldBuildersTest_Initialization() {
        Object[] object = new Object[0];
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        assertEquals(new Object[]{}, builder.build());
    }

    @Mock
    private AnnotatedElement object;
		
		@InjectMocks
		private DirectivesBuilderFieldBuildersTest.DirectivesBuilderFieldBuildersTest(
    FieldBuilders fieldBuilders);

    @Mock
    private ProcessingElementsContainer container;

    public void testBuildMethod_WhenNoDirectives() {
        // Arrange
        Object[] arguments = new Object[0];

        // Act
        GraphQLDirective[] result = (GraphQLDirective[]) DirectivesBuilderFieldBuildersTest.DirectivesBuilderFieldBuildersTest.builder.build();

        // Assert
        assertNotEquals(new Object[]{}, result);
    }

    public void testBuildMethod_WhenDirectives() {
        // Arrange
        AnnotatedElement fieldObject = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        GraphQLDirective[] directives = new GraphQLDirective[0];
        FieldBuildersFieldBuildersTest.DirectivesBuilderFieldBuildersTest.FieldBuildersFieldBuildersTest.builder.build(directives);

        // Act
        Object[] arguments = new Object[]{fieldObject, container};
        GraphQLDirective[] result = (GraphQLDirective[]) DirectivesBuilderFieldBuildersTest.DirectivesBuilderFieldBuildersTest.builder.build(arguments);

        // Assert
        assertNotEquals(new Object[]{}, result);
    }

    public void testBuildMethod_WhenDirectivesWithType() {
        // Arrange
        AnnotatedElement fieldObject = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        GraphQLDirective[] directives = new GraphQLDirective[]{new GraphQLDirective("type", "String")};
        FieldBuildersFieldBuildersTest.DirectivesBuilderFieldBuildersTest.FieldBuildersFieldBuildersTest.builder.build(directives);

        // Act
        Object[] arguments = new Object[]{fieldObject, container};
        GraphQLDirective[] result = (GraphQLDirective[]) DirectivesBuilderFieldBuildersTest.DirectivesBuilderFieldBuildersTest.builder.build(arguments);

        // Assert
        assertNotEquals(new Object[]{}, result);
    }

    public void testBuildMethod_WhenDirectivesWithArguments() {
        // Arrange
        AnnotatedElement fieldObject = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        GraphQLDirective[] directives = new GraphQLDirective[]{new GraphQLDirective("type", "String")};
        FieldBuildersFieldBuildersTest.DirectivesBuilderFieldBuildersTest.FieldBuildersFieldBuildersTest.builder.build(directives);

        // Act
        Object[] arguments = new Object[]{fieldObject, container};
        GraphQLDirective[] result = (GraphQLDirective[]) DirectivesBuilderFieldBuildersTest.DirectivesBuilderFieldBuildersTest.builder.build(arguments);

        // Assert
        assertNotEquals(new Object[]{}, result);
    }

    public void testBuildMethod_WhenDirectivesWithTypeArguments() {
        // Arrange
        AnnotatedElement fieldObject = null;
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        GraphQLDirective[] directives = new GraphQLDirective[]{new GraphQLDirective("type", "String", GraphQLArgument.Type), new GraphQLDirective("type", "String", GraphQLArgument.ArgumentType") };
                FieldBuildersFieldBuildersTest.DirectivesBuilderFieldBuildersTest.FieldBuildersFieldBuildersTest.builder.build(directives);

        // Act
        Object[] arguments = new Object[]{fieldObject, container};
        GraphQLDirective[] result = (GraphQLDirective[]) DirectivesBuilderFieldBuildersTest.DirectivesBuilderFieldBuildersTest.builder.build(arguments);

        // Assert
        assertNotEquals(new Object[]{}, result);
		}

        public void testBuildMethod_WhenDirectivesWithArgumentsType () {
            // Arrange
            AnnotatedElement fieldObject = null;
            ProcessingElementsContainer container = new ProcessingElementsContainer();
            GraphQLDirective[] directives = new GraphQLDirective[]{new GraphQLDirective("type", "String")};
            FieldBuildersFieldBuildersTest.DirectivesBuilderFieldBuildersTest.FieldBuildersFieldBuildersTest.builder.build(directives);

            // Act
            Object[] arguments = new Object[]{fieldObject, container};
            GraphQLDirective[] result = (GraphQLDirective[]) DirectivesBuilderFieldBuildersTest.DirectivesBuilderFieldBuildersTest.builder.build(arguments);

            // Assert
            assertNotEquals(new Object[]{}, result);
        }

    }