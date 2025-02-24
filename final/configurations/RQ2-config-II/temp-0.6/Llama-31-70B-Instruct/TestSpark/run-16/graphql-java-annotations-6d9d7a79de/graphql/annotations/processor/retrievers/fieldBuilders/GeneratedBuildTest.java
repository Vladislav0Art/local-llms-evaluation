package graphql.annotations.processor.retrievers.fieldBuilders;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {

    private DirectivesBuilder directivesBuilder;

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private ProcessingElementsContainer processingElementsContainer;

    @Before
    public void setUp() {
        directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
    }

    @Test
    public void buildTest() {
        GraphQLDirective[] directives = directivesBuilder.build();

        assertNotNull(directives);
    }

}