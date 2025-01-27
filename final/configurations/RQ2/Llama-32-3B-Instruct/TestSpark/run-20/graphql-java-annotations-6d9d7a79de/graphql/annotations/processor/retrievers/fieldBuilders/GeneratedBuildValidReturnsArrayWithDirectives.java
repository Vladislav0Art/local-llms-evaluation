package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;

public class GeneratedBuildValidReturnsArrayWithDirectives {

    @Test
    public void buildValidReturnsArrayWithDirectives() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        GraphQLDirective[] directives = {new GraphQLDirective("testDirective", Arrays.asList(), false, new EnumSet<>(), new ArrayList<>(), null)};
        DirectivesBuilder directivesBuilder = new DirectivesBuilder();
        try {
            Assertions.assertEquals(new GraphQLDirective[0], directivesBuilder.build());
        } catch (Exception e) {
            fail("Expected no exception");
        }
    }

}

public class Builder {

    public Object build() throws Exception {
        return null;
    }

}

class GraphQLDirective {

    private String name;
    private List<Object> typeArguments;
    private boolean isDeprecated;
    private EnumSet<DirectiveLocation> locations;
    private List<GraphQLArgument> arguments;

    public GraphQLDirective(String name, List<Object> typeArguments, boolean isDeprecated, EnumSet<DirectiveLocation> locations, List<GraphQLArgument> arguments) {
        this.name = name;
        this.typeArguments = typeArguments;
        this.isDeprecated = isDeprecated;
        this.locations = locations;
        this.arguments = arguments;
    }

}