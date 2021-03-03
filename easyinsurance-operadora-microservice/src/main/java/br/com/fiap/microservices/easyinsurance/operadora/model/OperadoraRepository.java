/**
 * 
 */
package br.com.fiap.microservices.easyinsurance.operadora.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.fiap.microservices.easyinsurance.operadora.entity.Operadora;


/**
 * @author SaraRegina
 * Com essa classe n�o se faz necess�ria a implementacao do m�todo Service
 */
@RepositoryRestResource( path = "operadora", collectionResourceRel = "operadora")
public interface OperadoraRepository extends PagingAndSortingRepository<Operadora, Long> {

}

