package jp.kobespiral.todo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.kobespiral.todo.entitiy.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  public Iterable<Todo> findUserByUidLike(String uid);
  public Iterable<Todo> findUserByNameLike(String name);
}