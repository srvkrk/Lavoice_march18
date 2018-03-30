package com.lavoice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.lavoice.bean.RegistrationRequest;
import com.lavoice.bean.RegistrationResponse;

@Component
public class RegistrationDaoImpl implements RegistrationDao {

	@Autowired
    MongoOperations mongoTemplate;
 
    final String COLLECTION = "userInfo";
    
	public RegistrationResponse insertUser(RegistrationRequest user) {
		mongoTemplate.insert(user);
		 Query query = new Query(Criteria.where("username").is(user.getUsername()));
	        return mongoTemplate.findOne(query, RegistrationResponse.class, COLLECTION);
	}
	
	public void verifyUser(String id, String username) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(id).and("username").is(username));
		Update update = new Update();
		update.set("emailVerified", "Y");
		mongoTemplate.findAndModify(
				query, update, 
				new FindAndModifyOptions().returnNew(true), RegistrationResponse.class, COLLECTION);
	}

}
