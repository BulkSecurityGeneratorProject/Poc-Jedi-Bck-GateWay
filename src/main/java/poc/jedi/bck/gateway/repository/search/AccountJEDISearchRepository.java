package poc.jedi.bck.gateway.repository.search;

import poc.jedi.bck.gateway.domain.AccountJEDI;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the AccountJEDI entity.
 */
public interface AccountJEDISearchRepository extends ElasticsearchRepository<AccountJEDI, Long> {
}
