package cn.jawar.learn.spring3.domain.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author dongs
 */
@NoRepositoryBean
public interface BaseRepository<T, ID> extends ListPagingAndSortingRepository<T, ID>, ListCrudRepository<T, ID> {

}
