package cn.jawar.learn.spring3.web;

import cn.jawar.learn.spring3.domain.entity.UserEntity;
import cn.jawar.learn.spring3.domain.repository.UserRepository;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Resource
    private UserRepository userRepository;

    @GetMapping
    public Optional<UserEntity> demo() {
        return userRepository.findById(1L);
    }
}
