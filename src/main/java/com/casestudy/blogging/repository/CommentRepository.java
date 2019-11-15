package com.casestudy.blogging.repository;

import com.casestudy.blogging.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comments,Long> {

}
