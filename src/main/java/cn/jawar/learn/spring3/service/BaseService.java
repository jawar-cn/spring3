package cn.jawar.learn.spring3.service;

import java.util.Optional;

/**
 * @author dongs
 */
public interface BaseService<T> {


    Optional<T> findById(Long id);

}
