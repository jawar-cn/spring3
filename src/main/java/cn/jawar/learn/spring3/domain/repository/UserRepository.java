package cn.jawar.learn.spring3.domain.repository;

import cn.jawar.learn.spring3.domain.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * @author dongs
 */
@Repository
public interface UserRepository extends BaseRepository<UserEntity, Long> {

}
