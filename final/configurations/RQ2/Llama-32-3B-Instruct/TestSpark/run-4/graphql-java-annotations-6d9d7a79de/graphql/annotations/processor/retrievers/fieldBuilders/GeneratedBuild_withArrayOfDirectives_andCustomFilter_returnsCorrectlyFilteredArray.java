package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedBuild_withArrayOfDirectives_andCustomFilter_returnsCorrectlyFilteredArray {

    @Test
    public void build_withArrayOfDirectives_andCustomFilter_returnsCorrectlyFilteredArray() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        List<GraphQLDirective> directives = Arrays.asList(
                newDirective("testDirective1"),
                newDirective("testDirective2"),
                newDirective("testDirective3")
        );

        when(container.getCustomFilter()).thenReturn((directives) -> Arrays.asList(directives.get(0), directives.get(1)));

        GraphQLDirective[] result = builder.build();

        assert result.length == 2;
        assert result[0] == newDirective("testDirective1");
        assert result[1] == newDirective("testDirective2");
    }

}