package jp.kobespiral.todo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.kobespiral.todo.entitiy.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  public Iterable<User> findUserByUidLike(String uid);
  public Iterable<User> findUserByNameLike(String name);
}