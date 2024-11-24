package br.edu.fatecsjc.lgnspringapi.service;

import br.edu.fatecsjc.lgnspringapi.entity.Organization;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
public class OrganizationServiceTest {

    @Autowired
    private OrganizationService service;

    @Test
    void testSaveOrganization() {
        Organization org = new Organization();
        org.setName("Example Org");
        Organization savedOrg = service.save(org);

        assertNotNull(savedOrg);
        assertEquals("Example Org", savedOrg.getName());
            }
        
            private void assertEquals(String expected, String name) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
            }
        
            private void assertNotNull(Organization savedOrg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
