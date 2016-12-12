package com.nixsolution.usermanagment.db;

import java.util.Collection;

import com.vladbel.usermanagment.User;

public interface UserDao {
	User create(User user) throws DatabaseException;
	void update (User user) throws DatabaseException;
	void delete (User user) throws DatabaseException;
	User find(Long id) throws DatabaseException;
	Collection findAll() throws DatabaseException;
	void setConnectionFactory(ConnectionFactory connectionFactory);
}