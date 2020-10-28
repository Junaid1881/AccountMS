package ibm.ob.api.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ibm.ob.api.model.RequestAccountIds;

@Repository
public interface RequestAccountIdsRepo extends MongoRepository<RequestAccountIds,String>{

}
