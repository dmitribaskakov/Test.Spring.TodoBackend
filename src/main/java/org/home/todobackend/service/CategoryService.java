package org.home.todobackend.service;

import org.springframework.stereotype.Service;
import org.home.todobackend.entity.Category;
import org.home.todobackend.repo.CategoryRepository;

import javax.transaction.Transactional;
import java.util.List;


@Service
// все методы класса должны выполниться без ошибки, чтобы транзакция завершилась
// если в методе выполняются несколько SQL запросов и возникнет исключение - то все выполненные операции откатятся (Rollback)
@Transactional
public class CategoryService {

    // работает встроенный механизм DI из Spring, который при старте приложения подставит в эту переменную нужные класс-реализацию
    private final CategoryRepository repository; // сервис имеет право обращаться к репозиторию (БД)

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }


    public Category findById(Long id) {
        return repository.findById(id).get();
    }


}
