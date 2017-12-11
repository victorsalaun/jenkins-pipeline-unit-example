import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

class HelloworldTest extends BasePipelineTest {

    @Before
    void setup() {
        super.setUp()
    }

    @Test
    void should_return_true() {
        loadScript('jobs/helloworld.jenkins')
        printCallStack()
        assertJobStatusSuccess()
    }

}
