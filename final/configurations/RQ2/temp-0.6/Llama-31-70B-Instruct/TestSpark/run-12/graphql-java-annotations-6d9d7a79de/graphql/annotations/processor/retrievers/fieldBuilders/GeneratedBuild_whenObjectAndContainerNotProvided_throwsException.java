package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;

public class GeneratedBuild_whenObjectAndContainerNotProvided_throwsException {

    private DirectivesBuilder directivesBuilder;

    @Test
    public void build_whenObjectAndContainerNotProvided_throwsException() {
        directivesBuilder = new DirectivesBuilder(null, null);
        directivesBuilder.build();
    }

}