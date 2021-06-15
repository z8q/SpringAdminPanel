package com.z8q.springadminpanel.repos;

import org.springframework.data.repository.CrudRepository;

import com.z8q.springadminpanel.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}
