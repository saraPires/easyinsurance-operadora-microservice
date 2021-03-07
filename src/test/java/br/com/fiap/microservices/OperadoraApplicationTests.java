package br.com.fiap.microservices;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class OperadoraApplicationTests {

 	@Autowired
    private TestRestTemplate restTemplate;
     
    @LocalServerPort
    int randomServerPort;
    

	
	@Test
	void contextLoads() {
	}

}
