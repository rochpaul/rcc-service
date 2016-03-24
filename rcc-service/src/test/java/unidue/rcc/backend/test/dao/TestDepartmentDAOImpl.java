package unidue.rcc.backend.test.dao;

import static org.testng.AssertJUnit.assertTrue;
import org.apache.cayenne.validation.ValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import unidue.rcc.backend.exception.DatabaseException;
import unidue.rcc.backend.test.DbTestUtils;



/**
 * 
 * @author Paul Rochowski
 * @since 23.03.2016
 */
public class TestDepartmentDAOImpl {

    private static final Logger LOG = LoggerFactory.getLogger(TestDepartmentDAOImpl.class);

    private DbTestUtils dbTestUtils;

    @BeforeClass
    public void setup() throws Exception {

        try {

            dbTestUtils = new DbTestUtils();
            dbTestUtils.setupdb();

        } catch (DatabaseException | ValidationException e) {
            LOG.error("could not setup " + this.getClass().getSimpleName() + " tests: " + e.getMessage());
            throw e;
        }
    }

    @AfterClass
    public void shutdown() {

        dbTestUtils.shutdown();
    }

    @Test
    public void testDepartmentDAOImpl() {

        assertTrue(true);
    }
}
