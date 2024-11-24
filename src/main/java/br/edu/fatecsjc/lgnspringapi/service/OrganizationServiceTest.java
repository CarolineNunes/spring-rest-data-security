package br.edu.fatecsjc.lgnspringapi.service;

import br.edu.fatecsjc.lgnspringapi.entity.Organization;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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
}
